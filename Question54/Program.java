package Question54;

import java.util.Arrays;
import java.io.File;                  
import java.io.FileNotFoundException; 
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
       File file = new File("0054_poker.txt");
       try (Scanner scanner = new Scanner(file)) {
           int p1 = 0;
           while (scanner.hasNextLine()) {
               String line = scanner.nextLine();
               String[] cards = line.split(" ");
               String[] hand1 = Arrays.copyOfRange(cards, 0, 5);
               String[] hand2 = Arrays.copyOfRange(cards, 5, 10);
               int[] value1 = handValue(hand1);
               int[] value2 = handValue(hand2);
               if (value1[0] > value2[0] || (value1[0] == value2[0] && value1[1] > value2[1])) {
                   p1++;
               }
           }
           System.out.println(p1);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
    }

    public static int[] handValue(String[] hand){
    int[] value = {0, 0};
    int[] rankCount = new int[15];
    int[] suitCount = new int[4];
    int[] ranks = new int[5];
    char[] suits = new char[5];

    for (int i = 0; i < 5; i++) {
        char rankChar = hand[i].charAt(0);
        char suitChar = hand[i].charAt(1);
        int rank = 0;
        switch (rankChar) {
            case '2': rank = 2; break;
            case '3': rank = 3; break;
            case '4': rank = 4; break;
            case '5': rank = 5; break;
            case '6': rank = 6; break;
            case '7': rank = 7; break;
            case '8': rank = 8; break;
            case '9': rank = 9; break;
            case 'T': rank = 10; break;
            case 'J': rank = 11; break;
            case 'Q': rank = 12; break;
            case 'K': rank = 13; break;
            case 'A': rank = 14; break;
        }
        ranks[i] = rank;
        suits[i] = suitChar;
        rankCount[rank]++;
        switch (suitChar) {
            case 'H': suitCount[0]++; break;
            case 'D': suitCount[1]++; break;
            case 'S': suitCount[2]++; break;
            case 'C': suitCount[3]++; break;
        }
    }

    // Flush detection
    boolean isFlush = false;
    for (int count : suitCount) {
        if (count == 5) isFlush = true;
    }
    // Straight detection
    Arrays.sort(ranks);
    boolean isStraight = true;
    for (int i = 0; i < 4; i++) {
        if (ranks[i] + 1 != ranks[i + 1]) {
            isStraight = false;
            break;
        }
    }

    // Royal Flush
    if (isFlush && isStraight && ranks[0] == 10) {
        value[0] = 10;
        value[1] = 14;
        return value;
    }
    // Straight Flush
    if (isFlush && isStraight) {
        value[0] = 9;
        value[1] = ranks[4];
        return value;
    }
    // Four of a Kind
    for (int i = 2; i <= 14; i++) {
        if (rankCount[i] == 4) {
            value[0] = 8;
            value[1] = i;
            return value;
        }
    }
    // Full House
    boolean three = false, two = false;
    int threeRank = 0;
    for (int i = 2; i <= 14; i++) {
        if (rankCount[i] == 3) {
            three = true;
            threeRank = i;
        }
        if (rankCount[i] == 2) {
            two = true;
        }
    }
    if (three && two) {
        value[0] = 7;
        value[1] = threeRank;
        return value;
    }
    // Flush
    if (isFlush) {
        value[0] = 6;
        value[1] = ranks[4];
        return value;
    }
    // Straight
    if (isStraight) {
        value[0] = 5;
        value[1] = ranks[4];
        return value;
    }
    // Three of a Kind
    if (three) {
        value[0] = 4;
        value[1] = threeRank;
        return value;
    }
    // Two Pair
    int pairs = 0, highPair = 0;
    for (int i = 2; i <= 14; i++) {
        if (rankCount[i] == 2) {
            pairs++;
            if (i > highPair) highPair = i;
        }
    }
    if (pairs == 2) {
        value[0] = 3;
        value[1] = highPair;
        return value;
    }
    // One Pair
    if (pairs == 1) {
        value[0] = 2;
        value[1] = highPair;
        return value;
    }
    // High Card
    value[0] = 1;
    value[1] = ranks[4];
    return value;
}
}
