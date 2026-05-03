import java.util.Scanner;

public class Tickitbooking {
    public static void main(String[] args) {
        System.out.println("Where you want to go : ");
        System.out.println("For Dharamatala press 1");
        System.out.println("For Howrah press 2");
        System.out.println("For Baburdanga press 3");

        Scanner input = new Scanner(System.in);

        int Busstation = input.nextInt();

        if (Busstation==1){

            System.out.println("So u want go to Dharmatala :-");

            System.out.println("What is your pickup station :- ");
            System.out.println("For Howrah press 1");
            System.out.println("For Baburdanga press 2");
            int Station1 = input.nextInt();

            if (Station1 == 1 ){
                System.out.println("So You want to go from Howrah to Dharmatala");

            System.out.println("Entry your details :- Male or Female");
            System.out.println("For male press 3");
            System.out.println("For female press 4");
            int gender = input.nextInt();

            if (gender == 3){
                System.out.println("Male");
                System.out.println("What is your name :- ");
                String Name = input.next();
                System.out.println("Hallo " +Name+ " Wish your journey will be safe with us");
                System.out.println("Now tell me what is your age :- ");
                int Age1 = input.nextInt();
                
                if (Age1 <= 5){
                    System.out.println("Your tickit price is :- 15");
                    System.out.println("Thank you");

                }

                else if (5<Age1 && Age1<60){
                    System.out.println("Your tickit price is :- 30");
                    System.out.println("Thank you");
                }
                else{
                    System.out.println("Wow! great! stay fit Buddy......Many decades to come");
                    System.out.println("Your tickit price is 20");
                }


            }

            else if (gender == 4){
                System.out.println("Female");
                System.out.println("What is your name :- ");
                String Name = input.next();
                System.out.println("Hallo " +Name+ " Wish your journey will be safe with us");
                System.out.println("Now tell me what is your age :- ");
                int Age1 = input.nextInt();
                
                if (Age1 <= 5){
                    System.out.println( Name+" Your tickit price is :- 0");
                    System.out.println("Thank you! Enjoy your ride Sweet Little lady");

                }

                else if (5<Age1 && Age1<60){
                    System.out.println(Name+ " Your tickit price is :- 15");
                    System.out.println("Thank you");
                }
                else{
                    System.out.println(Name+" Wow you are " +Age1+ "year young ! great! stay strong Lady......Many decades to come");
                    System.out.println("Your tickit price is 0");
                    System.out.println("Thank you stay safe");
                }

            }
        }

        else if (Station1==2){

            System.out.println("So You want to go from Baburdanga to Dharmatala");

            System.out.println("Entry your details :- Male or Female");
            System.out.println("For male press 3");
            System.out.println("For female press 4");
            int gender = input.nextInt();
            

            if (gender == 3){
                System.out.println("Male");
                System.out.println("What is your name :- ");
                String Name = input.next();
                System.out.println("Hallo " +Name+ " Wish your journey will be safe with us");
                System.out.println("Now tell me what is your age :- ");
                int Age1 = input.nextInt();
                
                if (Age1 <= 5){
                    System.out.println("Your tickit price is :- 30");
                    System.out.println("Thank you");

                }

                else if (5<Age1 && Age1<60){
                    System.out.println("Your tickit price is :- 60");
                    System.out.println("Thank you");
                }
                else{
                    System.out.println("Wow! great! stay fit Buddy......Many decades to come");
                    System.out.println("Your tickit price is 40");
                }


            }

            else if (gender == 4){
                System.out.println("Female");
                System.out.println("What is your name :- ");
                String Name = input.next();
                System.out.println("Hallo " +Name+ " Wish your journey will be safe with us");
                System.out.println("Now tell me what is your age :- ");
                int Age2 = input.nextInt();
                
                if (Age2 <= 5){
                    System.out.println( Name+" Your tickit price is :- 0");
                    System.out.println("Thank you! Enjoy your ride Sweet Little lady");

                }

                else if (5<Age2 && Age2<60){
                    System.out.println(Name+ " Your tickit price is :- 30");
                    System.out.println("Thank you");
                }
                else{
                    System.out.println(Name+" Wow you are " +Age2+ "year young ! great! stay strong Lady......Many decades to come");
                    System.out.println("Your tickit price is 0");
                    System.out.println("Thank you stay safe");
                }

            }
        }

    }

    else if (Busstation==2)
    {
        System.out.println("So u want go to Howrah :-");

        System.out.println("What is your poickup station :- ");
        System.out.println("For Dharmatala press 1");
        System.out.println("For Baburdanga press 2");
        int Station2 = input.nextInt();

        if (Station2 == 1 ){
            System.out.println("So You want to go from Dharmatala to Howrah");

        System.out.println("Entry your details :- Male or Female");
        System.out.println("For male press 3");
        System.out.println("For female press 4");
        int gender = input.nextInt();

        if (gender == 3){
            System.out.println("Male");
            System.out.println("What is your name :- ");
            String Name = input.next();
            System.out.println("Hallo " +Name+ " Wish your journey will be safe with us");
            System.out.println("Now tell me what is your age :- ");
            int Age1 = input.nextInt();
            
            if (Age1 <= 5){
                System.out.println("Your tickit price is :- 15");
                System.out.println("Thank you");

            }

            else if (5<Age1 && Age1<60){
                System.out.println("Your tickit price is :- 30");
                System.out.println("Thank you");
            }
            else{
                System.out.println("Wow! great! stay fit Buddy......Many decades to come");
                System.out.println("Your tickit price is 20");
            }


        }

        else if (gender == 4){
            System.out.println("Female");
            System.out.println("What is your name :- ");
            String Name = input.next();
            System.out.println("Hallo " +Name+ " Wish your journey will be safe with us");
            System.out.println("Now tell me what is your age :- ");
            int Age1 = input.nextInt();
            
            if (Age1 <= 5){
                System.out.println( Name+" Your tickit price is :- 0");
                System.out.println("Thank you! Enjoy your ride Sweet Little lady");

            }

            else if (5<Age1 && Age1<60){
                System.out.println(Name+ " Your tickit price is :- 15");
                System.out.println("Thank you");
            }
            else{
                System.out.println(Name+" Wow you are " +Age1+ "year young ! great! stay strong Lady......Many decades to come");
                System.out.println("Your tickit price is 0");
                System.out.println("Thank you stay safe");
            }

        }
    }

    else if (Station2==2){

        System.out.println("So You want to go from Baburdanga to Howrah");

        System.out.println("Entry your details :- Male or Female");
        System.out.println("For male press 3");
        System.out.println("For female press 4");
        int gender = input.nextInt();
        

        if (gender == 3){
            System.out.println("Male");
            System.out.println("What is your name :- ");
            String Name = input.next();
            System.out.println("Hallo " +Name+ " Wish your journey will be safe with us");
            System.out.println("Now tell me what is your age :- ");
            int Age1 = input.nextInt();
            
            if (Age1 <= 5){
                System.out.println("Your tickit price is :- 15");
                System.out.println("Thank you");

            }

            else if (5<Age1 && Age1<60){
                System.out.println("Your tickit price is :- 30");
                System.out.println("Thank you");
            }
            else{
                System.out.println("Wow! great! stay fit Buddy......Many decades to come");
                System.out.println("Your tickit price is 20");
            }


        }

        else if (gender == 4){
            System.out.println("Female");
            System.out.println("What is your name :- ");
            String Name = input.next();
            System.out.println("Hallo " +Name+ " Wish your journey will be safe with us");
            System.out.println("Now tell me what is your age :- ");
            int Age2 = input.nextInt();
            
            if (Age2 <= 5){
                System.out.println( Name+" Your tickit price is :- 0");
                System.out.println("Thank you! Enjoy your ride Sweet Little lady");

            }

            else if (5<Age2 && Age2<60){
                System.out.println(Name+ " Your tickit price is :- 15");
                System.out.println("Thank you");
            }
            else{
                System.out.println(Name+" Wow you are " +Age2+ "year young ! great! stay strong Lady......Many decades to come");
                System.out.println("Your tickit price is 0");
                System.out.println("Thank you stay safe");
            }

        }
    }
    }

    else if(Busstation==3){

    System.out.println("So u want go to Baburdanga :-");

            System.out.println("What is your poickup station :- ");
            System.out.println("For Howrah press 1");
            System.out.println("For Dharmatala press 2");
            int Station1 = input.nextInt();

            if (Station1 == 1 ){
                System.out.println("So You want to go from Howrah to Baburdanga");

            System.out.println("Entry your details :- Male or Female");
            System.out.println("For male press 3");
            System.out.println("For female press 4");
            int gender = input.nextInt();

            if (gender == 3){
                System.out.println("Male");
                System.out.println("What is your name :- ");
                String Name = input.next();
                System.out.println("Hallo " +Name+ " Wish your journey will be safe with us");
                System.out.println("Now tell me what is your age :- ");
                int Age1 = input.nextInt();
                
                if (Age1 <= 5){
                    System.out.println("Your tickit price is :- 15");
                    System.out.println("Thank you");

                }

                else if (5<Age1 && Age1<60){
                    System.out.println("Your tickit price is :- 30");
                    System.out.println("Thank you");
                }
                else{
                    System.out.println("Wow! great! stay fit Buddy......Many decades to come");
                    System.out.println("Your tickit price is 20");
                }


            }

            else if (gender == 4){
                System.out.println("Female");
                System.out.println("What is your name :- ");
                String Name = input.next();
                System.out.println("Hallo " +Name+ " Wish your journey will be safe with us");
                System.out.println("Now tell me what is your age :- ");
                int Age1 = input.nextInt();
                
                if (Age1 <= 5){
                    System.out.println( Name+" Your tickit price is :- 0");
                    System.out.println("Thank you! Enjoy your ride Sweet Little lady");

                }

                else if (5<Age1 && Age1<60){
                    System.out.println(Name+ " Your tickit price is :- 15");
                    System.out.println("Thank you");
                }
                else{
                    System.out.println(Name+" Wow you are " +Age1+ "year young ! great! stay strong Lady......Many decades to come");
                    System.out.println("Your tickit price is 0");
                    System.out.println("Thank you stay safe");
                }

            }
        }

        else if (Station1==2){

            System.out.println("So You want to go from Dharmatala to Baburdanga");

            System.out.println("Entry your details :- Male or Female");
            System.out.println("For male press 3");
            System.out.println("For female press 4");
            int gender = input.nextInt();
            

            if (gender == 3){
                System.out.println("Male");
                System.out.println("What is your name :- ");
                String Name = input.next();
                System.out.println("Hallo " +Name+ " Wish your journey will be safe with us");
                System.out.println("Now tell me what is your age :- ");
                int Age1 = input.nextInt();
                
                if (Age1 <= 5){
                    System.out.println("Your tickit price is :- 30");
                    System.out.println("Thank you");

                }

                else if (5<Age1 && Age1<60){
                    System.out.println("Your tickit price is :- 60");
                    System.out.println("Thank you");
                }
                else{
                    System.out.println("Wow! great! stay fit Buddy......Many decades to come");
                    System.out.println("Your tickit price is 40");
                }


            }

            else if (gender == 4){
                System.out.println("Female");
                System.out.println("What is your name :- ");
                String Name = input.next();
                System.out.println("Hallo " +Name+ " Wish your journey will be safe with us");
                System.out.println("Now tell me what is your age :- ");
                int Age2 = input.nextInt();
                
                if (Age2 <= 5){
                    System.out.println( Name+" Your tickit price is :- 0");
                    System.out.println("Thank you! Enjoy your ride Sweet Little lady");

                }

                else if (5<Age2 && Age2<60){
                    System.out.println(Name+ " Your tickit price is :- 30");
                    System.out.println("Thank you! Safe Journey");
                }
                else{
                    System.out.println(Name+" Wow you are " +Age2+ "year young ! great! stay strong Lady......Many decades to come");
                    System.out.println("Your tickit price is 0");
                    System.out.println("Thank you stay safe");
                }

            }
        }
    }

    input.close();
    }
}
