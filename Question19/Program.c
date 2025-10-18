#include <stdio.h>

int day = 1;
int month = 1;
int year = 1900;
int dayOfWeek = 1;
int sundayCount = 0;

int is_leap_year(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

int days_in_month(int month, int year) {
    switch (month) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            return 31;
        case 4: case 6: case 9: case 11:
            return 30;
        case 2:
            return is_leap_year(year) ? 29 : 28;
        default:
            return 0; 
    }
}

void increment_date() {
    day++;
    dayOfWeek = (dayOfWeek + 1) % 7;
    
    if (day > days_in_month(month, year)) {
        day = 1;
        month++;
        if (month > 12) {
            month = 1;
            year++;
        }
    }
}

int main() {

    while (year < 1901) {
        increment_date();
    }
    
    while (year <= 2000) {
        if (day == 1 && dayOfWeek == 0) {
            sundayCount++;
        }
        increment_date();
    }
    
    printf("Total number of Sundays that fell on the first of the month during the twentieth century: %d\n", sundayCount);
    return 0;
}