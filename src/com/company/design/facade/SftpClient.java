package com.company.design.facade;


//Facade는 건물의 앞쪽 정면이라는 뜻을 가진다. 여러개의 객체와 실제 사용하는 서브 객체의 사이에 복잡한 의존 관계가 있을 때,
//중간에 facade라는 객체를 두고, 여기서 제공하는 interface만을 활용하여 기능을 사용하는 방식이다.
// Facade는 자신이 가지고 있는 각 클래스의 기능을 명확히 알아야 한다.
public class SftpClient {

    private Ftp ftp;
    private Reader reader;
    private Writer writer;

    public SftpClient(Ftp ftp, Reader reader, Writer writer) {
        this.ftp = ftp;
        this.reader = reader;
        this.writer = writer;
    }
    public SftpClient(String host, int port, String path, String filename) {
        this.ftp = new Ftp(host, port, path);
        this.reader = new Reader(filename);
        this.writer = new Writer(filename);
    }

    public void connect() {
        ftp.connect();
        ftp.moveDirectory();
        writer.fileConnect();
        reader.fileConnect();
    }

    public void Disconnect() {
        writer.fileDisconnect();
        reader.fileDisconnect();
        ftp.disConnect();
    }

    public void read() {
        reader.fileRead();
    }

    public void write() {
        writer.write();
    }
}
