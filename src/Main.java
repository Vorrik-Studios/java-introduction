import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* COLLECTIONS */


        String[] questions = new String[4];
        questions[0] = "What does WWW stand for?";
        questions[1] = "What is the World's Largest Ocean?";
        questions[2] = "Which Year did East and West Germany Unify?";
        questions[3] = "What is the capital of France?";

        String[] answers = new String[4];
        answers[0] = "World Wide Web";
        answers[1] = "Pacific Ocean";
        answers[2] = "1990";
        answers[3] = "Paris";

        // Creates a new List of strings called more questions
        // This is dynamic unlike Arrays
        // I would recommend just looking through all methods available on the List and explore
        List<String> moreQuestions = new ArrayList<>();
        moreQuestions.add("What website hosts most videos in the world?"); // First item so index 0 not 1
        moreQuestions.clear();
        moreQuestions.add("Question 1");
        moreQuestions.add("Question 2");
        moreQuestions.add("Question 3");
        // The list is now empty

        // You cant use primitive types so List<int> pointsOnTest = new ArrayList<>(); won't work
        List<Integer> pointsOnTest = new ArrayList<>();
        pointsOnTest.add(19);
        pointsOnTest.add(55);
        pointsOnTest.add(78);

        // A set basically a List that can't have duplicate elements
        // This can be especially useful for computer science
        Set<String> countriesToVisit = new HashSet<>();
        countriesToVisit.add("France");
        countriesToVisit.add("Germany");
        countriesToVisit.add("Spain");

        // A List that takes a key and a value, you can get the value of a key
        // So it is a map of a key to a value
        Map<String, Integer> countryToPopuationMap = new HashMap<>();
        countryToPopuationMap.put("USA", 345426571);
        countryToPopuationMap.put("India", 1450935791);
        countryToPopuationMap.put("Holy See", 496);

        System.out.println(countryToPopuationMap.get("USA"));
        System.out.println(countryToPopuationMap.get("India"));
        System.out.println(countryToPopuationMap.get("Holy See"));

        System.out.println(countryToPopuationMap);

        // Looping through a List
        for (int i = 0; i < moreQuestions.size(); i++) {
            System.out.println(moreQuestions.get(i));
        }

        // Looping through a Map
        for (Map.Entry<String, Integer> entry : countryToPopuationMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " | Value = " + entry.getValue());
        }

        // Looping through a Set
        for (String country : countriesToVisit) {
            System.out.println(country);
        }

    }
}
