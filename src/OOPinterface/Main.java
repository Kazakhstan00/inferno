package OOPinterface;

public class Main {
    public static void main(String[] args){
        Workers workers[] = new Workers[15];
        Staff s1 = new Staff(1,"Ismail","Lavrov",500000);
        workers[0] = s1;
        Staff s2 = new Staff(2,"Kairat","Bolmasov",450000);
        workers[1] = s2;
        Staff s3 = new Staff(3,"Akella","Zarant",100000);
        workers[2] = s3;
        Staff s4 = new Staff(4,"Alex","Nekral",150000);
        workers[3] = s4;
        Staff s5 = new Staff(5,"Zabrat","Mironov",200000);
        workers[4] = s5;
        HRManagers h1 = new HRManagers(6,"Andrei Jokins",250000);
        workers[5] = h1;
        HRManagers h2 = new HRManagers(7,"Zabit Kaleev",275000);
        workers[6] = h2;
        HRManagers h3 = new HRManagers(8,"Fauk Raul",260000);
        workers[7] = h3;
        HRManagers h4 = new HRManagers(9,"Gallo Tupi",300000);
        workers[8] = h4;
        HRManagers h5 = new HRManagers(10,"Jay Ari",240000);
        workers[9] = h5;
        Programmers p1 = new Programmers(11,"Gillermo Holo",700000,50000,0.5);
        workers[10] = p1;
        Programmers p2 = new Programmers(12,"Astam Indiamo",500000,45000,0.8);
        workers[11] = p2;
        Programmers p3 = new Programmers(13,"Anatolii Yapozh",600000,25000,0.8);
        workers[12] = p3;
        Programmers p4 = new Programmers(14,"Holor Gai",900000,20000,0.3);
        workers[13] = p4;
        Programmers p5 = new Programmers(15,"Igor Shpala",700000,50000,0.9);
        workers[14] = p5;
        BubbleSort(workers);
        System.out.println(workers[workers.length-1].getWorkerData()+" "+workers[workers.length-1].getSalary());
        System.out.println("---------------------");
        for(int i= workers.length-1;i>=0;i--){
            System.out.println(workers[i].getWorkerData()+" "+workers[i].getSalary());
        }





    }

    public static void BubbleSort(Workers[] arr) {
        boolean sorted = false;
        Workers temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].getSalary() > arr[i + 1].getSalary()) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}