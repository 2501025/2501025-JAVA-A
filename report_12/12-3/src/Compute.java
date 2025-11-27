public class Compute {
    static final String[] number =
            {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};

    static final String[] unitSmall =
            {"", "십", "백", "천"};

    static final String[] unitBig =
            {"", "만", "억", "조"};

    static String convertHangul(long money) {

        if (money == 0) return "영";

        StringBuilder result = new StringBuilder();

        int bigUnitIdx = 0;

        while (money > 0) {

            int part = (int)(money % 10000);
            money /= 10000;

            if (part != 0) {
                String hangulPart = convertPart(part);

                result.insert(0, hangulPart + unitBig[bigUnitIdx] + " ");
            }

            bigUnitIdx++;
        }

        return result.toString().trim();
    }

    static String convertPart(int part) {

        StringBuilder sb = new StringBuilder();

        int idx = 0;

        while (part > 0) {
            int digit = part % 10;

            if (digit != 0) {
                sb.insert(0, number[digit] + unitSmall[idx]);
            }

            part /= 10;
            idx++;
        }

        return sb.toString();
    }
}