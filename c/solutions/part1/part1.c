#include <stdio.h>
#include <string.h>

int main()
{
    char str[] = "Here is a long sentence!\n";
    char * pointerToStringInArray;
    printf(str);
    
    pointerToStringInArray = strtok(str, " ");
    
    char longestWordSoFar[1000] = "";
    
    while (pointerToStringInArray != NULL)
    {
        if (strlen(pointerToStringInArray) > strlen(longestWordSoFar)) 
        {
            strncpy(longestWordSoFar, pointerToStringInArray, 1000);
        }

        pointerToStringInArray = strtok(NULL, " ");
    }
    
    printf("\n%s\n", longestWordSoFar);

    return 0;
}

