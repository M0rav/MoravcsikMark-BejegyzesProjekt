package hu.petrik.bejegyzesProjekt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BejegyzesProject {

    public static void main(String[] args) {
        List<Bejegyzes> UserList = new ArrayList<Bejegyzes>();
        Scanner sc = new Scanner(System.in);
        int fix = 0;
        System.out.println("Kérlek adj meg egy számot hogy hány uj bejegyzést adjak hozzá: ");
        int num = sc.nextInt();
        sc.nextLine();

        if (num < 0) {
            System.out.println("Nem megfelelő shzámot vagy nem számot adtál meg!");
        } else {
            for (int i = 0; i <= num; i++) {
                UserList.add(new Bejegyzes("szerzo", "tartalom"));
            }
        }
        sc.close();
        Scanner bc = new Scanner("bejegyzesek.csv");
        while (bc.hasNext()) {
            String[] line = bc.nextLine().split(";");
            UserList.add(new Bejegyzes(line[0], line[1]));
        }

        for (int i = 0; i < UserList.size() * 20; i++) {
            UserList.get(i).setLikeok(+1);
        }

        System.out.println("Kérlek adj meg egy szöveget meg egy szöveget ");
        String edit = bc.nextLine();
        for (int i = 0; i < UserList.size(); i++) {
            int a = 2;

        }
        bc.close();
        for (int i = 0; i < UserList.size(); i++) {
            System.out.println(UserList.get(i));
        }

        //2.
        int f = 0;
        for (int i = 0; i < UserList.size(); i++) {
            if (UserList.get(i).getLikeok() < f) {
                f = UserList.get(i).getLikeok();
                System.out.println("Ezek a likeok száma:" + f +"/n");
            }


        }
        int g =35;
        for (int i = 0; i < UserList.size() ; i++) {
            if (g <=UserList.get(i).getLikeok() );
            {
                System.out.println("van olyan bejegyzés ami 35 likeot kapoott ");
            }
        }

    }




}










