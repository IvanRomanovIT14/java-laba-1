class Task {
    public double fraction(double x) {
        int a = (int) x;
        return x - a;
    }

    public int charToNum(char x) {
        if (x >= '0' && x <= '9') {
            return x - '0';
        } else {
            return 0;
        }
    }

    public boolean is2Digits(int x) {
        if (x >= 10 && x <= 99) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isInRange(int a, int b, int num) {
        if ((num >= a && num <= b) || (num <= a && num >= b)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEqual(int a, int b, int c) {
        if (a == b && b == c) {
            return true;
        } else {
            return false;
        }
    }

    public int abs(int x) {
        return Math.abs(x);
    }

    public boolean is35(int x) {
        if ((x % 3 == 0) && (x % 5 == 0)) {
            return false;
        } else if ((x % 3 == 0) || (x % 5 == 0)) {
            return true;
        }
        return false;
    }

    public int max3(int x, int y, int z) {
        if (x >= y && x >= z) {
            return x;
        }
        if (y >= x && y >= z) {
            return y;
        }
        if (z >= x && z >= y) {
            return z;
        }
        return 0;
    }

    public int sum2(int x, int y) {
        if (x + y >= 10 && x + y <= 19) {
            return 20;
        } else {
            return x + y;
        }
    }

    public String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
        }
        return "это не день недели";
    }

    public String listNums(int x) {
        String res = "";
        for (int i = 0; i <= x; i++) {
            res += i + " ";
        }
        return res;
    }

    public String chet(int x) {
        String res = "";
        for (int i = 0; i <= x; i = i + 2) {
            res += i + " ";
        }
        return res;
    }

    public int numLen(long x) {
        int k = 0;
        while (x != 0) {
            k += 1;
            x = x / 10;
        }
        return k;
    }

    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println(); //перенос строки после каждой строки
        }
    }

    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int findFirst(int[] arr, int x) {
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs(int[] arr) {
        int s = 0, m = 0, g = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                g = arr[i];
                s = arr[i] * -1;
            } else {
                s = arr[i];
            }
            g = arr[i];
            if (s > Math.abs(m)) {
                m = g;
            }
        }
        return m;
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        if (pos < 0 || pos > arr.length) {
            System.out.println("Неверная позиция");
        }
        int[] newArr = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            newArr[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            newArr[ins.length + i] = arr[i];
        }
        return newArr;
    }

    public void printArray(int[] arr) //Метод для вывода массива
    {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int[] reverseBack(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }
        return res;
    }

    public int[] findAll(int[] arr, int x) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                cnt++;
            }
        }
        int[] res = new int[cnt];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                res[index] = i;
                index++;
            }
        }

        return res;
    }
}
