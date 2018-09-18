
public class Main {

    public static void main(String[] args) {
        //sets up the nodes with letters
        BSTNode a = new BSTNode("A");
        BSTNode b = new BSTNode("B");
        BSTNode c = new BSTNode("C");
        BSTNode d = new BSTNode("D");
        BSTNode e = new BSTNode("E");
        BSTNode f = new BSTNode("F");
        BSTNode g = new BSTNode("G");
        BSTNode h = new BSTNode("H");
        BSTNode i = new BSTNode("I");
        BSTNode j = new BSTNode("J");
        BSTNode k = new BSTNode("K");
        BSTNode l = new BSTNode("L");
        BSTNode m = new BSTNode("M");
        BSTNode n = new BSTNode("N");
        BSTNode o = new BSTNode("O");
        BSTNode p = new BSTNode("P");
        BSTNode q = new BSTNode("Q");
        BSTNode r = new BSTNode("R");
        BSTNode s = new BSTNode("S");
        BSTNode t = new BSTNode("T");
        BSTNode u = new BSTNode("U");
        BSTNode v = new BSTNode("V");
        BSTNode w = new BSTNode("W");
        BSTNode x = new BSTNode("X");
        BSTNode y = new BSTNode("Y");
        BSTNode z = new BSTNode("Z");
        //will be used to reset the current node during the code
        BSTNode root = new BSTNode("");
        //will be used to store and move through the morse code
        BSTNode current;
        current = root;
        //tree is set up using morse code. look at the tree on the notes.
        root.setLeft(e);
        root.setRight(t);

        e.setLeft(i);
        e.setRight(a);

        i.setLeft(s);
        i.setRight(u);

        a.setLeft(r);
        a.setRight(w);

        s.setLeft(h);
        s.setRight(v);

        u.setLeft(f);
        r.setLeft(l);

        w.setLeft(p);
        w.setRight(j);

        t.setLeft(n);
        t.setRight(m);

        n.setLeft(d);
        n.setRight(k);

        m.setLeft(g);
        m.setRight(o);

        d.setLeft(b);
        d.setRight(x);

        k.setLeft(c);
        k.setRight(y);

        g.setLeft(z);
        g.setRight(q);

        //user input
        Scanner morseCodeEnter = new Scanner(System.in);
        String morseCode;
        String output="";
        String currentCode;
        System.out.print("Enter the morse code for alphabets and enter # to finish: ");
        morseCode = morseCodeEnter.next();

        //loop number of morse codes in the input
        for(int I = 0; I < morseCode.length(); I++)
        {
            //if current morse code is • check if next code is _ if yes store the character
            currentCode = morseCode.substring(I,I+1);
            if(currentCode.equals("•"))
            {
                current = current.getLeft();
                    if((morseCode.substring(I+1,I+2).equals("_")))
                    {
                        output+=current.getInfo();
                        current = root;

                    }
            }
            //if current morse code is - check if next code is _ if yes store the character
            else if(currentCode.equals("-")) {

                    current = current.getRight();

                    if((morseCode.substring(I+1,I+2).equals("_")))
                    {
                        output+=current.getInfo();
                        current = root;
                    }

            }
            //if current morse code is _ check if next code is also _ if yes add space in output
            else if(currentCode.equals("_")) {

                    if((morseCode.substring(I+1,I+2).equals("_")))
                    {
                        output+=" ";
                        current = root;
                    }
                else   //if not reset the current node
                {
                    current = root;
                }
            }//if current morse code is # add current character in output and end
            else if(currentCode.equals("#")){
            output+=current.getInfo();
            break;
        }
        }
        System.out.print(output);
    }

}

