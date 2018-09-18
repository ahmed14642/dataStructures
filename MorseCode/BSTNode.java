/**
 * Created by ahmedayaz on 5/5/17.
 */
public class BSTNode  {
    protected String info;
    protected BSTNode left;
    protected BSTNode right;

//Constructor:

    public BSTNode(String info)
    {
        this.info = info;
        left = null;
        right = null;
    }

    public String getInfo()
    {
        return info;
    }
    public BSTNode getLeft()
    {
        return left;
    }
    public BSTNode getRight()
    {
        return right;
    }
    public void setInfo(String info)
    {
        this.info = info;
    }
    public void setLeft(BSTNode left)
    {
        this.left = left;
    }
    public void setRight(BSTNode right)
    {
        this.right = right;
}
}