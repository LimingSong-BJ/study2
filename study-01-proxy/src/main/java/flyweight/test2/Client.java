package flyweight.test2;

public class Client {
    public static void main(String[] args) {
        TicketI ticket = TicketFactory.queryTicket("郑州","哈尔滨");
        ticket.showInfo("硬座");
        TicketI ticket2 = TicketFactory.queryTicket("郑州","哈尔滨");
        ticket2.showInfo("硬座");
        TicketI ticket3 = TicketFactory.queryTicket("郑州","哈尔滨");
        ticket3.showInfo("站票");
    }


}
