//ip = "127.0.0.1:80"
// разделить адрес ip v4 на ip и port

public static void main(String[] args) {
  String ip = "127.0.0.1:80";
  String[] ips = ip.split(":");
    System.out.println("IP-адрес:" + ips[0]);
    System.out.println("Номер порта:" + ips[1]);
}
