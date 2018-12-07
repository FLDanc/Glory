package com.captain.demo.sockerThread;

import java.io.*;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/**
 * Socket�ͻ�����ʾʾ��
 */
public class SocketClientDemo {

    public static void main(String[] args) {
        Socket client = null;
        try {
            client = new Socket("localhost",1000);
            //��һ��ͨѶ
            //д����Ϣ��������
            PrintWriter out = new PrintWriter(client.getOutputStream());
            out.println("Ф�غ������£�Ф�غ�������");
            out.flush();

            //��ȡ�ӷ������ش�����Ϣ
            Reader reader = new InputStreamReader(client.getInputStream());
            BufferedReader in = new BufferedReader(reader);
            String serverMessage = in.readLine();  //��ȡһ�пͻ��˴�������Ϣ������
            System.out.println("�������ش�����Ϣ��"+serverMessage);

            TimeUnit.SECONDS.sleep(10);

            //�ڶ���ͨѶ
            out.println("�����ڲ������·������ȼ�գ�");
            out.flush();
            serverMessage = in.readLine();
            System.out.println("���������صİ��ţ�"+serverMessage);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                if(client!=null){
                    client.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
