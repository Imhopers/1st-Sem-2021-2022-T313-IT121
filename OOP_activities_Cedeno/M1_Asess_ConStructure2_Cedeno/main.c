#include <stdio.h>
int main() {

int age, option;
printf("Select Gender");
printf("\n[1]-Male");
printf("\n[2]-Female\n");

scanf("%d", &option);

switch(option){
case 1:
    printf("\n\nYou select Male");
    printf("\nEnter Age\n");
    scanf("%d", &age);

    if(age >=90){
        printf("\nThe pension is 4000\n", age);
    }
        else if(age>=60){
            printf("\nThe pension is 6000\n");
        }
            else if(age<60){
                printf("\nThe pension is 0\n");
            }
            break;

case 2:
    printf("\n\nYou selected Female");
    printf("\n\Enter Age\n");
    scanf("%d", &age);

    if (age>=90){
        printf("\nThe pension is 3000\n");
    }
     else if(age>=60){
            printf("\nThe pension is 5000\n");
        }
            else if(age<60){
                printf("\nThe pension is 0\n");
            }

}
}
