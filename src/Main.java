import java.util.Scanner;
// ms = myStack, mq = myQueue
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack ms = new Stack();
        Queue mq = new Queue();
        while (true) {
            System.out.println("-----------------------------------------------------");
            System.out.println("ENTER YOUR OPTIONS");
            System.out.println("1. ENTERING THE MESSAGE");
            System.out.println("2. SENDING THE MESSAGE");
            System.out.println("3. DISPLAYING THE MESSAGE");
            System.out.println("4. DELETE MESSAGE JUST ENTERED");
            System.out.println("5. EXIT");
            System.out.println("-----------------------------------------------------");
            System.out.print("Your choice: ");
            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the message and type 'done' to exit typing:");
                        String mess = "";
                        while (!mess.equals("done")) {
                            mess = sc.nextLine();
                            if (!mess.equals("done") && !mess.isEmpty() && mess.length() < 250) {
                                mq.enqueue(new Node(mess));
                            }
                        }
                        break;
                    case 2:
                        if (mq.isEmpty()) {
                            System.out.println("No messages have been sent yet!\n");
                        } else {
                            while (!mq.isEmpty()) {
                                ms.push(mq.dequeue());
                            }
                            System.out.println("Message has been sent!\n");
                        }
                        break;
                    case 3:
                        System.out.println("The message received is :");
                        ms.display();
                        System.out.println();
                        break;
                    case 4:
                        if (!ms.isEmpty()) {
                            ms.pop();
                            System.out.println("A message has been removed!\n");
                        } else {
                            System.out.println("There aren't any messages here!\n");
                        }
                        break;
                    case 5:
                        System.out.println("The program is being closed!");
                        System.out.println("Wait a minute...");
                        try {
                            Thread.sleep(3000);
                            System.exit(0);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    default:
                        System.out.println("Wrong key, please re-enter!\n");
                        break;
                }
            } else {
                System.out.println("Invalid input. Please enter a number!\n");
                sc.next();
            }
        }
    }
}
