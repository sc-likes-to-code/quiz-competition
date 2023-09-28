import java.util.*;
class QuizCompetition 
{
    public static void main() 
    {
        //Questions List
        String q1[] = {
            "1.Gosling's Award",
            "2.Turing's Award",
            "3.Techno Award",
            "4.Charles Babbage award"
        };
        String q2[] = {
            "1.JJ Thompson",
            "2.Erwin Schrodinger",
            "3.Robert J Oppenheimer",
            "4.Paul Dirac"
        };
        String q3[] = {
            "1.Xerox",
            "2.Apple",
            "3.Microsoft",
            "4.Hewlett-Packard"
        };
        String q4[] = {
            "1.Google AlphaGo",
            "2.Amazon ChessChamp",
            "3.IBM DeepBlue",
            "4.Harvard MasterAI"
        };
        String q5[] = {
            "1.Matrix",
            "2.Core",
            "3.Control",
            "4.Kernel"
        };
        String q6[] = {
            "1.Star",
            "2.Binary",
            "3.Linear",
            "4.Jump"
        };
        String q7[] = {
            "1.Farm",
            "2.Cache",
            "3.Stash",
            "4.Storehouse"
        };
        String q8[] = {
            "1.Data Abstarction",
            "2.Inheritance",
            "3.Polymorphism",
            "4.Encapsulation"
        };
        String q9[] = {
            "1.Elasticity",
            "2.Blocking",
            "3.Splitting",
            "4.Modularity"
        };
        String q10[] = {
            "1.Choke",
            "2.Bottleneck",
            "3.Overload",
            "4.Exceeded"
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("*******QUIZ GAME*******");
        System.out.println("To start please enter your name");
        String s = sc.next();
        System.out.println("Welcome " + s + "!");
        System.out.println("There are 10 MCQ type questions, each having 4 options, labelled 1,2,3 and 4. To select your choice, pressyour respective choice number.");
        System.out.println("Each correct answer, earns you 3 points, but you will be deducted 2 points for incorrect answers\n. ");
        int Totalpoints = 0;
        int Ca = 0;
        int Ia = 0;
        int Ga = 0;
        int Ra = 0;
        Ra = 2;
        //Q1
        System.out.println("Question 1 :");
        System.out.println("What is called the Nobel Prize of Computer Science?");
        for (int i = 0; i < 4; i++) 
        {
            System.out.println(q1[i]);
        }
        Ga = sc.nextInt();
        if (Ga == Ra) 
        {
            System.out.println("Correct! You get 3 points!\n");
            Ca++;
        }
        else 
        {
            System.out.println("Sorry,that is incorrect. The Correct Answer is " + q1[(Ra - 1)] + " . You lose 2 points\n");
            Ia++;
        }
        //Q2
        Ra = 3;
        System.out.println("Question 2 :");
        System.out.println("Which famous nuclear scientist once quoted a line from the Bhagvad Gita - 'I am become death. The destroyer of worlds?'");
        for (int i = 0; i < 4; i++) 
        {
            System.out.println(q2[i]);
        }
        Ga = sc.nextInt();
        if (Ga == Ra) 
        {
            System.out.println("Correct! You get 3 points!\n");
            Ca++;
        } 
        else 
        {
            System.out.println("Sorry,that is incorrect. The Correct Answer is " + q2[(Ra - 1)] + " . You lose 2 points\n");
            Ia++;
        }
        //Question 3
        Ra = 1;
        System.out.println("Question 3 :");
        System.out.println("Which company invented the first ever Graphical User Interface?");
        for (int i = 0; i < 4; i++) 
        {
            System.out.println(q3[i]);
        }
        Ga = sc.nextInt();
        if (Ga == Ra) 
        {
            System.out.println("Correct! You get 3 points!\n");
            Ca++;
        } 
        else 
        {
            System.out.println("Sorry,that is incorrect. The Correct Answer is " + q3[(Ra - 1)] + " . You lose 2 points\n");
            Ia++;
        }
        //Question 4
        Ra = 3;
        System.out.println("Question 4 :");
        System.out.println("What was the first Artificial Intelligence Software to beat a human in a game of chess when it defeated reigning chess champion, Garry Kasparov?");
        for (int i = 0; i < 4; i++) 
        {
            System.out.println(q4[i]);
        }
        Ga = sc.nextInt();
        if (Ga == Ra) 
        {
            System.out.println("Correct! You get 3 points!\n");
            Ca++;
        }
        else 
        {
            System.out.println("Sorry,that is incorrect. The Correct Answer is " + q4[(Ra - 1)] + " . You lose 2 points\n");
            Ia++;
        }
        //Question 5
        Ra = 4;
        System.out.println("Question 5 :");System.out.println("What is The core of an operating system, providing access to the hardware elements of a computer via system calls known as?");
        for (int i = 0; i < 4; i++) 
        {
            System.out.println(q5[i]);
        }
        Ga = sc.nextInt();
        if (Ga == Ra) 
        {
            System.out.println("Correct! You get 3 points!\n");
            Ca++;
        } 
        else 
        {
            System.out.println("Sorry,that is incorrect. The Correct Answer is " + q5[(Ra - 1)] + " . You lose 2 points\n");
            Ia++;
        }
        //Question 6
        Ra = 1;
        System.out.println("Question 6 :");
        System.out.println("Which of the following is a common search algorithm that uses a heuristic function?");
        for (int i = 0; i < 4; i++) 
        {
            System.out.println(q6[i]);
        }
        Ga = sc.nextInt();
        if (Ga == Ra) 
        {
            System.out.println("Correct! You get 3 points!\n");
            Ca++;
        }
        else 
        {
            System.out.println("Sorry,that is incorrect. The Correct Answer is " + q6[(Ra - 1)] + " . You lose 2 points\n");
            Ia++;
        }
        //Question 7
        Ra = 2;
        System.out.println("Question 7 :");
        System.out.println("What is a structure that stores data so as to serve future requests faster known as?");
        for (int i = 0; i < 4; i++) 
        {
            System.out.println(q7[i]);
        }
        Ga = sc.nextInt();
        if (Ga == Ra) 
        {
            System.out.println("Correct! You get 3 points!\n");
            Ca++;
        } 
        else 
        {
            System.out.println("Sorry,that is incorrect. The Correct Answer is " + q7[(Ra - 1)] + " . You lose 2 points\n");
            Ia++;
        }
        //Question 8
        Ra = 3;
        System.out.println("Question 8 :");
        System.out.println("What is the idea in object-oriented programming that different kinds of object types can been seen as the same through a common interface known as?");
        for (int i = 0; i < 4; i++) 
        {
            System.out.println(q8[i]);
        }
        Ga = sc.nextInt();
        if (Ga == Ra) 
        {
            System.out.println("Correct! You get 3 points!\n");
            Ca++;
        } 
        else 
        {
            System.out.println("Sorry,that is incorrect. The Correct Answer is " + q8[(Ra - 1)] + " . You lose 2 points\n");
            Ia++;
        }
        //Question 9
        Ra = 4;
        System.out.println("Question 9:");
        System.out.println("What is dividing complex and large program into smaller sub-programs that can be implemented and tested on their own called as?");
        for (int i = 0; i < 4; i++) 
        {
            System.out.println(q9[i]);
        }
        Ga = sc.nextInt();
        if (Ga == Ra) 
        {
            System.out.println("Correct! You get 3 points!\n");
            Ca++;
        }
        else 
        {
            System.out.println("Sorry,that is incorrect. The Correct Answer is " + q9[(Ra - 1)] + " . You lose 2 points\n");
            Ia++;
        }
        //Question 10
        Ra = 2;
        System.out.println("Question 10:");
        System.out.println("What is any condition – obvious or unseen– through which data flow becomes limited thanks to insufficient computer or network resources called as?");
        for (int i = 0; i < 4; i++) 
        {
            System.out.println(q10[i]);
        }
        Ga = sc.nextInt();
        if (Ga == Ra) 
        {
            System.out.println("Correct! You get 3 points!\n");
            Ca++;
        }
        else 
        {
            System.out.println("Sorry,that is incorrect. The Correct Answer is " + q10[(Ra - 1)] + " . You lose 2 points\n");
            Ia++;
        }
        System.out.println("This quiz has ended!");
        Totalpoints = (Ca * 3) - (Ia * 2);
        System.out.println("Congratulations!! You have recieved " +
        Totalpoints + " points!!\n!");
        System.out.println("Thank you for playing");
}
}