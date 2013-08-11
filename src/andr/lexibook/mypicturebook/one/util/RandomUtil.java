package andr.lexibook.mypicturebook.one.util;

/**
 * Created by rain on 8/11/13.
 */
public class RandomUtil {

    private int TopLength = 4;
    private int SubLength = 2;
    private int QueLength = 1;

    private int TopMax = 4;

    public RandomUtil() {
    }

    public RandomUtil(int topLength, int subLength, int queLength) {
        this.TopLength = topLength;
        this.SubLength = subLength;
        this.QueLength = queLength;
    }

    public static int[][] getQuestionOrder() {
        return new RandomUtil().randomQ();
    }

    private int[][] randomQ() {
        int[][] qs = new int[TopLength * SubLength][3];
        int[] topic = getRandom(TopLength, TopMax);
        for (int i = 0; i < topic.length; i++) {
            int[] sub = getRandomSubTop(topic[i]);
            for (int j = 0; j < sub.length; j++) {
                int tmp = i * sub.length;
                int[] que = getRandomQuestion(topic[i]);
                int queTmp = 0;
                for (int l = 0; l < que.length; l++) {
                    queTmp = que[l];
                }
                qs[tmp + j][0] = topic[i];
                qs[tmp + j][1] = sub[j];
                qs[tmp + j][2] = queTmp;
            }
        }
        return qs;
    }

    private int[] getRandomQuestion(int topic) {
        if (topic < 3) {
            return getRandom(QueLength, 4);
        }
        return getRandom(QueLength, 2);
    }

    private int[] getRandomSubTop(int topic) {
        if (topic < 3) {
            return getRandom(SubLength, 4);
        }
        return getRandom(SubLength, 5);
    }

    private int[] getRandom(int length, int max) {
        int[] topics = new int[length];
        for (int i = 0; i < length; i++) {
            topics[i] = (int) (Math.random() * max);
            for (int j = 0; j < i; j++) {
                if (topics[j] == topics[i]) {
                    i--;
                    continue;
                }
            }
        }
        return topics;
    }
}
