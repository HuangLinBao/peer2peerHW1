package io.github.HuangLinBao;
import java.util.*;
import java.io.*;
import java.net.*;


public class ClientThread  {
    private  DatagramSocket clientSocket = null;//UDP socket
    private String message;
    private  InetAddress IPAddress ;//VM server IP

    public ClientThread (String msg,String IP) throws UnknownHostException, SocketException {
        this.message = msg;
        this.IPAddress = InetAddress.getByName(IP);
        this.clientSocket = new DatagramSocket();
    }


    public void send() throws IOException {
        String sentence = "\n";
        byte[] sendData;//packet array
        sendData = sentence.getBytes();
        DatagramPacket sendPacket =
                new DatagramPacket(sendData, sendData.length, this.IPAddress, 8080); //send the packet to server
        this.clientSocket.send(sendPacket);
        sentence = this.message;
        sendData = sentence.getBytes();
        sendPacket =
                new DatagramPacket(sendData, sendData.length, this.IPAddress, 8080); //send the packet to server
        this.clientSocket.send(sendPacket);
    }

    public void closeSocket() {
        clientSocket.close();
    }

//    public void receive() throws IOException {
//        byte[] receiveData = new byte[1024];
//        DatagramPacket receivePacket =
//                new DatagramPacket(receiveData, receiveData.length);// receive the packet from server
//        clientSocket.receive(receivePacket);
//        this.receivedMsg = new String(receivePacket.getData());
//    }
//
//     @Override
//    public void run() {
//
//        while (true){
//            try {
//                this.receive();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


//     }
}
