package com.captain.demo.sockerThread;

import java.io.*;
import java.net.Socket;

/**
 * ����ͨ�ŷ����������߳�
 */
public class SocketServerThread implements Runnable {

    private Socket socket;  //�ͻ��˴򿪵�����

    /**
     * ����ͻ��˴򿪵�����
     * @param socket
     */
    public SocketServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("����ͻ���ҵ���߳�����");
        try {
            //��һ��ͨѶ
            //��ȡ�ӿͻ��˴�������Ϣ
            Reader reader = new InputStreamReader(socket.getInputStream());
            BufferedReader in = new BufferedReader(reader);
            String clientMessage = in.readLine();  //��ȡһ�пͻ��˴�������Ϣ������
            System.out.println("�ͻ��˴�������Ϣ��"+clientMessage);

            //�ش���Ϣ���ͻ���
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            out.println("�������Ի��ǵ��ʺ�");
            out.flush();

            //�ڶ���ͨѶ
            clientMessage = in.readLine();
            System.out.println("�ͻ��˴����İ��ţ�"+clientMessage);
            out.println("�������Ҫ���ˣ�");
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(socket!=null){
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
