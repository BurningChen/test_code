package com;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BurningIce
 * @date 2021/2/25 9:56
 */
public class LetterCombination {
    /**
     * deal String digits
     * @param digits
     * @return
     */
    public List<String> combination(String digits) {

        int length = digits.length();
        List<String> list = new ArrayList<String>();
        String[] digitArray = new String[length];

        if (digitArray.length == 0) {
            return list;
        }

        for (int i = 0; i < length; i++) {
            switch (digits.charAt(i)) {
                case '2':
                    digitArray[i] = "abc";
                    break;
                case '3':
                    digitArray[i] = "def";
                    break;
                case '4':
                    digitArray[i] = "ghi";
                    break;
                case '5':
                    digitArray[i] = "jkl";
                    break;
                case '6':
                    digitArray[i] = "mno";
                    break;
                case '7':
                    digitArray[i] = "pqrs";
                    break;
                case '8':
                    digitArray[i] = "tuv";
                    break;
                case '9':
                    digitArray[i] = "wxyz";
                    break;
                default:
                    digitArray[i] = "";
            }
        }
        list = getStringWithFor(digitArray, 0, list, "");
        return list;
    }

    /**
     * Combinatorial sorting
     *
     * @param digitArray
     * @param index
     * @param list
     * @param stemp
     * @return
     */
    private static List<String> getStringWithFor(String[] digitArray, int index, List<String> list, String stemp) {

        if (index < digitArray.length - 1) {
            // array containing digitArray not include [0, 9], do nothing and index++
            if (digitArray[index].length() == 0) {
                list = getStringWithFor(digitArray, index+1, list, stemp);
            }

            // getStringWithFor
            for (int j = 0; j < digitArray[index].length(); j++) {
                list = getStringWithFor(digitArray, index+1, list, stemp + digitArray[index].charAt(j));
            }
        } else {
            // list push
            if (digitArray[index].length() != 0) {
                for (int j = 0; j < digitArray[index].length(); j++) {
                    list.add(stemp + digitArray[index].charAt(j));
                }
            }
        }
        return list;
    }
}
