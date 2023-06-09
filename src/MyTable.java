public class MyTable {
    private Entry[] entries;

    //returns the String that is matched with char c in the table
    public String get(char c) {
//implement
        for (Entry entry : entries) {
            if (c == entry.ch) {
                return entry.str;
            }
        }
        return "";
    }

    //adds to the table a pair (c, s) so that s can be looked up using c
    public void add(char c, String s) {
        //implement
        for (Entry entry : entries) {
            if (entry.ch == c) {
                if (c == s.toLowerCase().charAt(0))
                entry.str = s;
                else{
                    System.out.println("Check your inputs!");
                }
            }
        }
    }

    //returns a String consisting of nicely formatted display
    //of the contents of the table
    public String toString() {
        //implement
        StringBuilder sb = new StringBuilder();
        for (Entry entry : entries) {
            if (entry != null) {
                sb.append(entry).append("\n");
            }
        }
        return sb.toString();
    }

    MyTable() {
        entries = new Entry[26];
        for (int i = 0; i < 26; i++) {
            Entry entry = new Entry(Character.toChars(97 + i)[0], "");
            entries[i] = entry;
        }
    }

    private class Entry {
        char ch;
        String str;

        Entry(char ch, String str) {
            this.ch = ch;
            this.str = str;
        }

        //returns a String of the form "ch->str"
        public String toString() {
            return ch + "->" + str;
        }
    }
}
