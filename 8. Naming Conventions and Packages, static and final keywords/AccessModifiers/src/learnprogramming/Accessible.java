package learnprogramming;

/*  CHALLENGE
In the following interface declaration, what is the visibility of:
1. the Accessible interface?    Package-private
2. the int variable SOME_CONSTANT?  public static final
3. methodA? public
4. methodB and methodC? public
 */

interface Accessible {

    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();

}
