package Rizeq.JavaLearning;

import java.util.List;

public class Producer implements Runnable{

    List<Integer> questionList = null;
    final int LIMIT = 5;
    private int questionNo;

    Object myObject = new Object();

    public Producer(List<Integer> questionList) {
        this.questionList = questionList;
    }

    public void readQuestions (int questionNo) throws InterruptedException {
        synchronized (questionList) {
            while (questionList.size() == LIMIT) {
                System.out.println("Questions have been piled up... wait for answers");
                questionList.wait();
            }
        }

        synchronized (questionList) {
            System.out.println("New question: " + questionNo);
            questionList.add(questionNo);
            Thread.sleep(100);
            questionList.notify();

        }
    }

    @Override
    public void run() {

        while (true) {
            try {
                readQuestions(questionNo++);

            }catch (InterruptedException e) {

            }
        }

    }
}
