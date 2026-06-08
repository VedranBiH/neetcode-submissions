class MinStack {
    ArrayList<Integer> list;
    Integer min;
    ArrayList<Integer> minIndex;

    public MinStack() {
        list = new ArrayList<>();
    }

    public void push(int val) {
        if (min == null || val < min) {
            min = val;
        }
        list.add(val);
    }

    public void pop() {
        Integer value = list.remove(list.size() - 1);
        if (value.equals(min)) {
            min = null;
            for (Integer val : list) {
                if (min == null) {
                    min = val;
                } else if (val < min) {
                    min = val;
                }
            }
        }
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return min;
    }
}
