#include <stdio.h>
int main() {
    int w, h, p, q, t, x, y;
    scanf("%d %d", &w, &h);
    scanf("%d %d", &p, &q);
    scanf("%d", &t);

    x = p, y = q;	 
	if (((x + t) / w) % 2 == 0)
		x = (x + t) % w;
	else
		x = w - ((x + t) % w);
		
	if (((y + t) / h) % 2 == 0)
		y = (y + t) % h;
	else
		y = h - ((y + t) % h);
    
    printf("%d %d", x, y);

    return 0;
}