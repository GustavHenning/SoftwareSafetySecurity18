package tinder;

public class NodeChuck {
    public jif.lang.Principal user;
    public int distance;
    public NodeChuck next;
    
    public NodeChuck tinder$NodeChuck$(final jif.lang.Principal user,
                                       final int distance) {
        this.jif$init();
        {
            this.user = user;
            this.distance = distance;
            this.next = null;
        }
        return this;
    }
    
    public void add(final NodeChuck node) {
        if (this.next == null) {
            this.next = node;
            return;
        }
        NodeChuck n = this.next;
        while (n != null && n.next != null) { n = n.next; }
        if (n == null) { n = node; } else { n.next = node; }
    }
    
    public static NodeChuck append(final NodeChuck a, final NodeChuck b) {
        if (a == null) return b;
        a.add(b);
        return a;
    }
    
    public static final String jlc$CompilerVersion$jif = "3.5.0";
    public static final long jlc$SourceLastModified$jif = 1523889228000L;
    public static final String jlc$ClassType$jif =
      ("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");
    
    public NodeChuck() { super(); }
    
    private void jif$init() {  }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1523889228000L;
    public static final String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALV6Wcw02XVQ//+sXmfGwUsc2xnbvy3bZf/V3dW1dIaQdHVX" +
       "19pd1dVV1dUVkqH2fd8rDARQsCGSwzI2QSJ+MhIYk0iJIh5QpLwAiRJFCopY" +
       "BfEDEqDghzwAL0Co7u/711mAB1q6S93l3HPOPefcc/vc735/8lxZTF7N0qh3" +
       "o7S6X/WZXd4X9KK0rXWkl6U0NrxufgMA3/xbP/XyrzwzeUmbvOQnx0qvfHOd" +
       "JpXdVdrk/bEdG3ZRrizLtrTJK4ltW0e78PXIH8aBaaJNPlT6bqJXdWGXol2m" +
       "UXMZ+KGyzuziuuaDRm7yfjNNyqqozSotymryMhfojQ7WlR+BnF9Wr3GT5x3f" +
       "jqwyn/y5yR1u8pwT6e448CPcAyrAK0Rwe2kfh7/XH9EsHN20H0x5NvQTq5r8" +
       "8NMzHlJ8jx0HjFNfiO3KSx8u9Wyijw2TD92gFOmJCx6rwk/ccehzaT2uUk0+" +
       "/o5Ax0EvZroZ6q79ejX52NPjhJuucdR7rmy5TKkmH3562BVSV0w+/tSePbZb" +
       "39//ya//dEIld684W7YZXfB/bpz0qacmibZjF3Zi2jcT3/8l7pv6R379a3cn" +
       "k3Hwh58afDPmH/3ZP/rxL3/qN37zZswPvc0Y3ghss3rd/Lbxwd/7xPqLy2cu" +
       "aLyYpaV/EYUnKL/uqnDb81qXjbL4kYcQL533H3T+hvhPzz/zHfsP707eS0+e" +
       "N9OojkepesVM48yP7IK0E7vQK9uiJ++xE2t97acnL4x1zk/sm1becUq7oifP" +
       "Rtem59Pr98giZwRxYdGzY91PnPRBPdMr71rvsslk8sKYJh8d0zNj+sJt+bFq" +
       "cgJ1pwTDyrtf2qCXxjbogh7oenaSjKIBun4FHlOnavXCPuqOXfVH26wLv+pn" +
       "GFgW5lcC3wGrUd7sAtynlr32ajO8PzZm//9AdxeqPtDeuTMy/BNPK380agqV" +
       "RuOk1803a5z4o196/bfvPhT/W36MinkD+P5DwJM7d64A/8RFO252b+R9OOr0" +
       "qLbv/+LxJ5k/87XPjDzrsvbZkXOXofeeFuJHqk+PNX2UzNfNl776n/7bL3/z" +
       "jfSROFeTe2/RsrfOvGjJZ54mrkhN2xqt0CPwX3pV/7XXf/2Ne3cvW/6e0fhU" +
       "+igeoyZ/6uk1ntCW1x5YngtD7nKT9zlpEevRpeuBuXhv5RVp+6jlyvX3Xesf" +
       "/OPxd2dM/+uSLoJ1abiUo3lZ3wr1qw+lOstuduzC3acoulq5Hz1mv/ivfvc/" +
       "Q3cvmDwwiC89ZjmPdvXaY0p4Afb+q7q98mizpMK2x3H/7heEv/mN73/1J647" +
       "NY747NsteO+SX/DUR/zS4md/M//Xf/Dvv/37dx/tbjV5PquNyDevmH9iBPT5" +
       "R0uN+hmNNmLEpLwnJ3Fq+Y6vG5F9kZT/8dLnZr/2X77+8s12R2PLDfOKyZf/" +
       "zwAetf8gPvmZ3/6p//6pK5g75uV8eMSOR8NujM4PPIK8Kgq9v+DR/YV//sm/" +
       "/c/0XxzN12gySn+wr1ZgciVvcqUKuO7l56/5l57q+8ol+6Hu2vfha/vz5VsN" +
       "8PZykj2SRQ387t/5+PpP/eEV6UeyeIHx8e6tqqroj6nJ/Dvxf737mef/yd3J" +
       "C9rk5eshqieVokf1ZVe18Rgs17eN3OQDT/Q/eaTd2O/XHuraJ57Wg8eWfVoL" +
       "HpmIsX4Zfam/8Ljgj4x48cKkHxvThSvhbbm49L6cXfJXujuTawW6TvnUJfvM" +
       "w9l3Jre2+DILui2/8tjsavJsXY7eyOXjQyNpo727fyFsVH4/Mf1Mj2506ZKD" +
       "TyL1o2N6bkzfuS3rt0HqR94VqeeuKnxTJk8g9aLl3/DsbcRgxCweFbO5PYft" +
       "r735V//4/tffvPuYs/LZt/gLj8+5cViufH7vVd+6cZVPv9sq1xnb//jLb/zj" +
       "v/fGV28O8w89efQSSR3/w3/xP3/n/i9877fexv4/M7pV78jIz1/kfUy/d1v+" +
       "6tswcvuujLzM+pXb8rtP7m4yOp3XlR9b/oboO6PZeQ66D9+fXr7ZmwWu+acv" +
       "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" +
       "qACdlm3WJzFKNljXcSGzkFPMUjf7eT1V");
    public static final String jlc$ClassType$jl$1 =
      ("txULCW4ZKVZPVv2Sk0O6U0XugCf+vtIzwTgjdVopA1g4JWKxGprWnLyVFvuc" +
       "xedOVINEu2/ETQwubXmbR5s5R6GdMlWW3SqIF8qxU7IG9lsDDONQoZiaOCgO" +
       "cd5DfQWBTY5TCi3EKgehWSY0jQg6ZwGmDIOoNsMp9AsAa6G5wQWMxKoDuJm2" +
       "u5O5s/er1eryt/mfvv0H/pVrfODhS5HAdy4d4vVP9u7tQhrX3/O37wUevB94" +
       "5bGQxmMxwsklbvPJd3racY3ZfPsvvvkti/+7s7u3gcZ1NXlPlWZfiezGjh4D" +
       "9ewI6YefgrS7Pmd5FDP8+7vv/hb5efNv3J088zDc95ZXMU9Oeu3JIN97C7uq" +
       "i0R6ItT3g08Gg/78TeWOeNvwbx8PBj0KTrxTJOgy5d/clr//NNseBV/vXqm+" +
       "e/nELtnqCjp+lxDt9Z2HN+7ozUuGew9fMtx7hJTzJCkvj2n8uPOrt+U/+H8j" +
       "5TLlO7flt9+ZlDs3IfQbkbrkzbtQcc3yavKMbllvGwJqUt96ipaXLrPvj+nV" +
       "URp//Lb89DvQ8nT87Mriz10yvnuSxA/eQnr1tvyB/6vd+sAjOv/Su9D5s5fs" +
       "jWryvJ5ldmK94xa98gCbB2U1+bG3vqj4kVfzWi/9fDQ39heywm/GxlcvnHp1" +
       "VOh7fuJXX/jiqz/96k/85PHVN7748PnF2/LjTjV54RbCI35MHmz5E6hcev9K" +
       "lr0LlT//Ln1//ZJ9tZq8+ADFy/fQjfr/UHIvjxk+9pbXfDdvzsxf+tZLL370" +
       "W/K/vL50efgu7Hlu8qJTR9HjkfvH6s9nhe341/Wfv4nj3zDjG+NO3OjN5eub" +
       "2duER28eEnT/G63kONllKAAA");
}
