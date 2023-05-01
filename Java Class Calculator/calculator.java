/*
* Art
* 1 → Addieren
* 2 → Subtrahieren
* 3 → Dividieren
* 4 → Multiplizieren
*/



public int calculate(int art, double zahl1, double zahl2) {
    double result;
    if(art == 1) {
        result = zahl1 + zahl2;
    } else if(art == 2) {
        result = zahl1 - zahl2;
    } else if(art == 3) {
        result = zahl1 / zahl2;
    } else if(art == 4) {
        result = zahl1 * zahl2;
    }
    return result;
}

//Example:
System.out.println(calculate(4, 4, 2)); //Multipliziert 4*2