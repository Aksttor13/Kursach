package Client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

import static Client.Menu.firstMenu;

public class Client {
    private static Socket clientSocket;
    public static BufferedReader in;
    public static BufferedWriter out;
    public static Scanner reader;

    public static void main(String[] args) {

        try {
            clientSocket = new Socket("localhost", 4004);
            reader = new Scanner(System.in);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            firstMenu();
        } catch (IOException e) {

            System.out.println("Ошибка подключения!");
        }
    }
}