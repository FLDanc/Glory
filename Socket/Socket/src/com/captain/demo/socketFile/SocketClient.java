package com.captain.demo.socketFile;

import com.captain.demo.utils.FileUtil;

import java.io.*;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

/**
 * �ļ����Ϳͻ���
 */
public class SocketClient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SocketClient client = new SocketClient();
        while (true){
            System.out.println("����������Ҫ�Ĺ��ܣ�1�����ļ���2�˳�");
            String message = sc.next();
            if("2".equals(message)){
                break;
            }else{
                System.out.println("������Ҫ�����ļ�������·����");
                String path = sc.next();
                try {
                    List<String> context = FileUtil.readFile(path); //��ȡ�ļ�����
                    if(context.size()>0){  //�ļ����������������͸�������
                        boolean flag = client.sendFileToServer(context
                                ,path.substring(path.lastIndexOf("\\"),path.length()));
                        if(flag){
                            System.out.println("�ļ����ͳɹ�");
                        }else{
                            System.out.println("�ļ�����ʧ��");
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        sc.close();
    }

    /**
     * �����ļ����ݵ�������
     * @param context
     * @param fileName
     * @return
     * @throws IOException
     */
    private boolean sendFileToServer(List<String> context,String fileName) throws IOException {
        Socket socket = new Socket("localhost",1000);
        PrintWriter writer = new PrintWriter(socket.getOutputStream());
        writer.println("�����ǵػ�");  //��һ���԰���
        writer.flush();
        for(String str : context){  //�����ļ�����
            writer.println(str);
            writer.flush();
        }
        writer.println("endendend");  //���ͽ�����־
        writer.flush();
        writer.println(fileName);  //�����ļ���
        writer.flush();
        Reader reader = new InputStreamReader(socket.getInputStream());
        BufferedReader in = new BufferedReader(reader);
        String serverMessage = in.readLine();  //��ȡ���������
        socket.close();
        if("�ļ�����ɹ�".equals(serverMessage)){
            return true;
        }else{
            return false;
        }
    }

}

