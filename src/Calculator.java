public class Calculator {

    public int calculatePrice(int displacement) {
        if (displacement <= 1200) {
            return 69;
        } else if (displacement <= 1400) {
            return 88;
        } else if (displacement <= 1600) {
            return 108;
        } else if (displacement <= 1800) {
            return 128;
        } else if (displacement <= 2000) {
            return 148;
        } else if (displacement <= 2500) {
            return 208;
        } else if (displacement <= 3000) {
            return 358;
        } else if (displacement <= 3500) {
            return 508;
        } else if (displacement <= 4000) {
            return 658;
        } else if (displacement <= 4500) {
            return 808;
        } else if (displacement <= 5000) {
            return 958;
        } else if (displacement <= 5500) {
            return 1108;
        } else if (displacement <= 6000) {
            return 1258;
        } else if (displacement <= 7000) {
            return 1558;
        } else if (displacement <= 8000) {
            return 1858;
        } else if (displacement <= 9000) {
            return 2158;
        }else if (displacement <= 10000) {
            return 2458;
        }else if (displacement <= 11000) {
            return 2758;
        }
        return 0;
    }
}
