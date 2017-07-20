package calen;

import java.util.Scanner;

public class Calender {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		// return MAX_DAYS[month-1];

		// switch (month) {
		// case 2:
		// return 28;
		// case 4:
		// return 30;d
		// default:
		// return 31;
		// }

		if (month == 1) {
			return 31;
		} else if (month == 2) {
			return 28;
		} else {

			return 30;
		}
	}

	public void printSampleCalendar() {
		System.out.println("--------------------");
		System.out.println("일   월   화   수   목   금   토");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30 31");

	}

	public static void main(String[] args) {

		// 숫자를 입력받아 해당하는 달의 최대일 수를 출력하느 프로그램
		// System.out.println("원하는 달을 입력하세요");
		  Scanner scanner = new Scanner(System.in);
		  Calender cal = new Calender();

		System.out.println("반복횟수를 입력하세요");

		int repeat = scanner.nextInt();
		for (int i = 0; i < repeat; i++) {
			System.out.println("달을 입력하세요");
			int month = scanner.nextInt();
			// int maxDayz [] ={31,28,31,30,31,30,31,31,30,31,30,31};
			System.out.printf("%d월은 %d까지 있습니다\n", month, cal.getMaxDaysOfMonth(month));
			cal.printSampleCalendar();
		}
		System.out.println("bye~~");
		scanner.close();
		// int maxDayz [] ={31,28,31,30,31,30,31,31,30,31,30,31};
		// System.out.printf("%d월은 %d까지 있습니다\n", month,
		// cal.getMaxDaysOfMonth(month));
		// cal.printSampleCalendar();

		
	}
}
