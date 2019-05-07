\*
  Try This 5-2
   A queue class for character.
*/
 Class Queue {
char q[]; // this array holds the queue
int putloc,getloc; // the put and get incides

Queue(int size) {
q= new char [size]; // allocate memory for queue
putloc=getloc=0;
}

// put a character into the queue 
void put (char ch)  {
if (putloc==q.length)  {
system.out.print("-Queue is full.");
return;
}