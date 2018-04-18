package tinder;

public class NodeBob {
    public jif.lang.Principal user;
    public int distance;
    public NodeBob next;
    
    public NodeBob tinder$NodeBob$(final jif.lang.Principal user,
                                   final int distance) {
        this.jif$init();
        {
            this.user = user;
            this.distance = distance;
            this.next = null;
        }
        return this;
    }
    
    public void add(final NodeBob node) {
        if (this.next == null) {
            this.next = node;
            return;
        }
        NodeBob n = this.next;
        while (n != null && n.next != null) { n = n.next; }
        if (n == null) { n = node; } else { n.next = node; }
    }
    
    public static NodeBob append(final NodeBob a, final NodeBob b) {
        if (a == null) return b;
        a.add(b);
        return a;
    }
    
    public static final String jlc$CompilerVersion$jif = "3.5.0";
    public static final long jlc$SourceLastModified$jif = 1524054796000L;
    public static final String jlc$ClassType$jif =
      ("H4sIAAAAAAAAAK1aDXQV1bU+95IfgkhCIBD+LxBAQHIFFbQRRQJI8CopCVqD" +
       "cDuZe24yZO7MZGZucoOlT19XxVrL6kIQqMJqu7T1B8V2lcKqtbXaVgTrsn32" +
       "ge2yWvvzfK+lon1/rj7rO3ufM/+TELOate45kzNn77N/vr3PPjNz5Bwpt0wy" +
       "Y7uSb7QHDGo1blDyrZJp0Vyrrg60s6Gs/MHXXs4duM14M0kqOshoxdqsWVKe" +
       "ZkiVVLS7dVOxB2xSk9ku9Unpoq2o6Yxi2U0ZcpGsa5ZtSopmW73ksySRITUK" +
       "G5E0W5Fsmltn6gWbzM4YbKEuVbfTtGSnDcmUCmkUJd3arEqWxThV4KjDZLRh" +
       "6n1Kjpo2mZVhgovZqtRJ1XSruJeB/5pKJkk57IV+XDnkzLXbtzi9d/+2mm+P" +
       "ItUdpFrR2mzJVuRmXbOZPB1kbIEWOqlpXZ/L0VwHGa9RmmujpiKpyg42Udc6" +
       "SK2ldGmSXTSptYlautoHE2utosFEhDWdwQwZy01SlG3ddNSpyCtUzTn/ledV" +
       "qcuyySTPLFy9dTDObDGGmZOaeUmmDklZj6LlwBYhClfHhhvZBEZaWaDMX+5S" +
       "ZZrEBkgt95wqaV3pNttUtC42tVwv2mDgqYMybQJHSHKP1EWzNqkPz2vlt9is" +
       "KjQEkNikLjwNOTEvTQ15yeefczdfs/sObb2WRJlzVFZB/tGMaGaIaBPNU5Nq" +
       "MuWEYxdlHpAmPXtPkhA2uS40mc85/pn3Vl0687mTfM60mDkbO7dT2c7KD3eO" +
       "+/n05oVXj+IQ1C0FnB/QHMHfKu40lQwWWJNcjnCz0bn53Kaf3nbn4/RPSTKm" +
       "hVTIulosMByNl/WCoajUvIFq1IQQaSFVVMs14/0WUsmuM4pG+ejGfN6idgsp" +
       "U3GoQsf/mYnyjAWYqJJdK1ped64Nye7G65JBCKlkP1LHfqPYb77o65nHLVNe" +
       "glHFQEPN9M16jq7WOxvZkGGTzWkpb6V77O5Gi6a79QJNd6W7013dVNMYcNJd" +
       "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");
    
    public NodeBob() { super(); }
    
    private void jif$init() {  }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1524054796000L;
    public static final String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAJV6W8z02nXQ/P+55nrOCeTSNE1Pkz8hyTS/L2OPxz2UMh7P" +
       "2B5fxh57bI9Le/D9fhnfxnY5qIDaBCqlhZyEFtE8BQRV2kpIFQ+oqC9Aq1ZI" +
       "IC7lAZoHJEAlD30AXoDime/7r+c/B7Dkvbf33mvttdZea+1lL3/ne5MXqnLy" +
       "epEnvZ/k9f26L9zqvmiWleusErOqlLHjTfsbU+Dtv/mTr/6D5yavGJNXwkyu" +
       "zTq0V3lWu11tTD6YuqnlltXScVzHmLyWua4ju2VoJuEwTswzY/KRKvQzs25K" +
       "t9q7VZ60l4kfqZrCLa9rPujkJh+086yqy8au87KqJ69ykdmaQFOHCcCFVf0G" +
       "N3nRC93EqU6Tvzi5w01e8BLTHyd+jHvABXDFCGwu/eP094cjmaVn2u4DkOfj" +
       "MHPqyQ8+DfGQ43vsOGEEfSl16yB/uNTzmTl2TD5yQ1JiZj4g12WY+ePUF/Jm" +
       "XKWefPJdkY6TXi5MOzZ998168omn54k3Q+Os913FcgGpJx99etoVU1dOPvnU" +
       "nj22W98T/vTXfiqjs7tXmh3XTi70vzACffopoL3ruaWb2e4N4Ae/xH3T/Nhv" +
       "fvXuZDJO/uhTk2/m/MO/8Ed/9oc//Vu/fTPn+58xZ2dFrl2/aX/b+vC/+NTq" +
       "i/hzFzJeLvIqvKjCE5xfd1W8HXmjK0Zd/NhDjJfB+w8Gf2v/T48//SvuH96d" +
       "vJ+ZvGjnSZOOWvWanadFmLgl5WZuadauw0ze52bO6jrOTF4a21yYuTe9O8+r" +
       "3JqZPJ9cu17Mr8+jiLwRxUVEz4/tMPPyB+3CrINruysmk8lL4z356Hg/N96f" +
       "v60/Me54VdpfjkIPqEelcUtAyB2XyK37Y1dRTw6A6VVAXAf3KxcI8tQFfCAA" +
       "/MDNslFxAD+sATn36rNZurLpuXUvu3ZThnUPLYB3R9xdyPrQ+c6dUWKfetp6" +
       "k1HV6TwZQd60326I9R/92pu/e/eh/t4yVE8+fIP2/i3ayZ07V3R/8qLcN8If" +
       "RRePJjla3Qe/KP/E9s9/9TMjy11xfn5k/DL13tM6+MhymbFljor1pv3KV/7z" +
       "f//1b76VP9LGenLvHUbyTsiLkn/madbK3Had0Yk8Qv+l183fePM337p397Jj" +
       "7xt9R22Ouzsa4qefXuMJZX/jgeO4iOMuN/mAl5epmVyGHlj7++ugzM+Peq4y" +
       "/8C1/eE/Hq874/2/L/dFLy4dl3r0DqtbnXz9oVIWxc1+XaT7FEdXJ/WjcvHL" +
       "v//P/8vs7oWSB/7slcccn+zWbzxmQxdkH7xay2uPNkspXXec9+9/Ufz6N773" +
       "lR+/7tQ447PPWvDepbzQaY705eXP/Pbp3/3Bf/j2v7r7aHfryYtFYyWhfaX8" +
       "UyOizz9aajSvZDTxkZLq3iFLcyf0QtNK3Ium/M9XPgf9xn/92qs3252MPTfC" +
       "Kyc//H9H8Kj/+4jJT//uT/6PT1/R3LEv7v2ROB5Nu/EZf+IR5mVZmv2Fju4v" +
       "/csf+KV/Zv7y6H1Gi6/Cwb0a8eTK3uTK1fS6l5+/ll96auzLl+L7u+vYR6/9" +
       "L1bv9J+by0H0SBcN4Dt/+5OrP/OHV6If6eIFxye7dxqqaj5mJvCvpP/t7mde" +
       "/Cd3Jy8Zk1evZ6CZ1aqZNJddNcZTrFrddnKTDz0x/uSJdON+33hoa5962g4e" +
       "W/ZpK3jkIMb2Zfal/dLjij8K4uWLkD473hep8Lc1fBl9tbiUr3V3JtfG7Ary" +
       "6UvxmYfQdya3rvQCBd3W08eg68nzTTUGE5eHj4ysjd7u/oWx0fjDzA4LM7mx" +
       "pUsJPEnU6+P9wnjnt7X2DKJ+5D2JukCpt7X4BFEvO+GNzJ6hBiNl6WiY7e0x" +
       "6n717b/2x/e/9vbdx2KNz77juH8c5ibeuMr5/Vd768ZVfui9VrlCbP7Tr7/1" +
       "j/7eW1+5OYs/8uTJuc6a9Ff/zf/6vfu/+N3feYb3f26Mit5TkC+O9y/c1t0z" +
       "BLl5T0FeoM639enJ3c3GmPG68mPL3zB9Z3Q7L8zuo/fByzN7s8C1/KFLce9q" +
       "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" +
       "w10KIFNhNntyFhpg1iSxIazxvduIpb2Egj652kqEQKtzUyhF0FP8hbBeu0OK" +
       "6nYEaDgF0LGlIAblm8pU9qodObRInrZH0Q8tcA+ZzAKoEO/sg6Kyrm7wnOhD" +
       "BB6lYKfj0hKcIVyKCES+a8qzTA77OYwsApnqe9o+hyChkKu1WKP6KHqh7Siw" +
       "zE0It0cblGbISuCHDtF2fpYtm34X78H9gj1OV0askT6xZacImS32hERugc5y" +
       "F/DG7GoEBflmA7OjoUPKWtotBPpMcgxHGKNfs521R+5b3+j57ryKY8DUMsxM" +
       "8+VhvjGLJq5XS1ib0cg+XnFwgK3r3N47/ZxZwk6zoldTSjpmOo3oVgd6w8rJ" +
       "j4asb62CXTix3bJhFc3OXY8BfbJdzHUSmi8aWjCAZbkRPVWHxldoHtFVRwe6" +
       "Cp/pGnUUWNynN16HzxYU10LjOyc9KIDltwN+PuKWUSxNIGdIPWJmC0HbbS1c" +
       "H+PqaKNN14CfLOSzseOYdkrtVs14AhjgIOG7IcP3LW/AqiklTUcBXHZ0Ocw/" +
       "7M9424jpDketwUIA1lB1s5J4jTbAINHPpERk/nFeGv5sO7gbrdKBcGYfcH3Q" +
       "eSBDqBRKnIYolUF0WGPjZeuzh+M2ZDWM0oyRq+DUut0xSs0kGguloM4F4VQ4" +
       "wUqGHIBzfvaQqqbxYGt7o0q4lj4GunB0bh1sxrkG4Bvc0cuIqGjZSMEyz+MV" +
       "imWtc9ou6O25ZOGUb5bL5Y9ePq3+uduvtK9dvyE//BkgCr3LwP76IbZ71mfv" +
       "6/XibUr447f1a4999n4sjzS5fNv/gXfL3l+/63/7L7/9LWf3d6C7t1/eV/Xk" +
       "fXVefDlxWzd5DNXzI6YffAoTf/1j4VFe6e/z3/kd6vP237g7ee5hSugdPz48" +
       "CfTGk4mg95du3ZSZ8kQ66PueTBisbhv/+rb+W48nDB59wH63bMEF5Jdu668/" +
       "LbZHCbq7V67vXh4Xl2J5RZ2+RxrvmsoP6skrN7nue7e57nuPSPKeZOTV8R4f" +
       "7sxv6/v/f4xcQL58W/+pd2fkzk2S9Uah");
    public static final String jlc$ClassType$jl$1 =
      ("LmX7Hjxci1M9ec50nGcmCdo8dJ7i5ZUL9BduMjl3f/W2fvtdeHk6w3IV8Ocu" +
       "xa57ksUP32L6+m39s/9Pe/WhR3z+lffg82cuxVv15EWzKNzMedcteu0BNQ/q" +
       "evJj78y5/8jrp8aswlOT1+4XijJsx87XL5J6fTTne2EW1l/44us/9fqP/4T8" +
       "+ltffJigf6Y87tSTl24xPJLH5MGWP0HKZfSvFsV7cPnz7zH21y/FV+rJyw9I" +
       "vDwP3bj8rd5ekt2feMfPWje/FNm/9q1XXv74tw7/9vonxMPffl7kJi97TZI8" +
       "ntl9rP1iUbpeeF39xZs8740ovjHuw43NXJ6+WTwjfXaTaO7+D6X6SdNEJgAA");
}
