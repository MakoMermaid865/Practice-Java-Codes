public static void presentQuestion(Question q, Scanner in)
{
    if (q instanceof ChoiceQuestion)
    {
        ChoiceQuestion cq = (ChoiceQuestion) q;
        cq.addChoice("None of the above", false);
    }

    q.display();

    System.out.print("Your answer: ");
    String response = in.nextLine();

    System.out.println(q.checkAnswer(response));
}
/**
Input:Bjarne Stroustrup
2

Output: Who was the inventor of Java?
Your answer: false
Which country was the Java inventor born?
1: Australia
2: Canada
3: Denmark
4: United States
5: None of the above
Your answer: true

*/
