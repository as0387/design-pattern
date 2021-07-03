package com.company.design;

import com.company.design.facade.Ftp;
import com.company.design.facade.Reader;
import com.company.design.facade.SftpClient;
import com.company.design.facade.Writer;

public class FacadeMain {
    public static void main(String[] args) {

        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("Text.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("Text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disConnect();


        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "text.tmp");

        sftpClient.connect();

        sftpClient.read();

        sftpClient.read();

        sftpClient.Disconnect();
    }
}
