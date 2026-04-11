 import java.util.Scanner;


public class pattern{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();


                                                   //Square pattern
        // for (int i=0; i<n ; i++){
        //     for (int j=0; j<n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

                                                 //Righ angle triangle Pattern
        //  for (int i=1; i<=n; i++){
        //     for (int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //  }

                                                //Invert Right angle triangle Pattern
            // for(int i=n; i>=1; i--){
            //     for(int j=1; j<=i; j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }

                                              //Pyramid Pattern
        //    for(int i=1; i<=n; i++){
        //     for (int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for (int k=1; k<=(2*i)-1; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //    } 

                                                  //Inverted pyramid pattern

            // for (int i=n; i>=1; i--){
            //     for (int j=1; j<=n-i; j++){
            //         System.out.print(" ");
            //     }
            //     for (int k=1;k<=(2*i)-1;k++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // } 


                                                           //Number pattern in java 
            //  for (int i=1; i<=n; i++){
            //     for (int j=1; j<=i; j++){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            //  }

                                                          //Repeated number pattern
            //    for (int i=1; i<=n; i++){
            //     for (int j=1; j<=i; j++){
            //         System.out.print(i);
            //     }
            //     System.out.println();
            //    }

                                                       //Diamond start pattern in java

                 for (int i=1; i<=n; i++){
                    for (int j=1; j<=n-i; j++){
                        System.out.print(" ");
                    }
                    for (int k=1; k<=(2*i)-1; k++){
                        System.out.print("*");
                    }
                    System.out.println();
                 }


                    for (int i=n-1; i>=1; i--){
                        for (int j=1; j<=n-i; j++){
                            System.out.print(" ");
                        }
                        for (int k=1; k<=(2*i)-1; k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }

    }
}