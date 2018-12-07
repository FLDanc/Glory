package com.captain.demo.socketFile;

import com.captain.demo.utils.FileUtil;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * �����������߳�
 */
public class ServerThread implements Runnable {

    private Socket socket;

    /**
     * ����򿪵Ŀͻ�������
     * @param socket
     */
    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("������ת���߳��ѿ���");
        try {
            Reader reader = new InputStreamReader(socket.getInputStream());
            BufferedReader in = new BufferedReader(reader);
            //�԰��ţ���ֹ��������������
            String message = in.readLine();
            if(!"�����ǵػ�".equals(message)){
                return;
            }
            System.out.println("���������ŶԽ�ͨ��");
            //���մ�����ı�����
            List<String> context = getFile(in);
            System.out.println("�������ļ��������");
            String filename = in.readLine();//�ͻ���ָ�����ļ���
            System.out.println("�������ļ����������");
            boolean flag = FileUtil.writeFile(FileUtil.getFullPath(SocketFileServer.PATH,filename)
                    ,context,false);
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            if(flag){
                writer.println("�ļ�����ɹ�");
            }else{
                writer.println("�ļ�����ʧ��");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * ��ȡ�ı��ļ���ȫ������
     * @param in ������
     * @return ��ȡ�����ļ�����
     * @throws IOException
     */
    private List<String> getFile(BufferedReader in) 
    		throws IOException {
        List<String> context = new ArrayList<>();
        while(true){
            String tempStr = in.readLine();
            if("endendend".equals(tempStr)){
                break;
            }
            context.add(tempStr);
        }
        return context;
    }
}

