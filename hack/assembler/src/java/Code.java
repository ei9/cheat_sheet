import java.util.HashMap;

class Code {
    private static HashMap<String, String> destMap = new HashMap<>();
    private static HashMap<String, String> compMap = new HashMap<>();
    private static HashMap<String, String> jumpMap = new HashMap<>();

    private static final String[][] destCode = {
        {"",     "000"},
        {"M",    "001"},
        {"D",    "010"},
        {"MD",   "011"}, {"DM",   "011"},
        {"A",    "100"},
        {"AM",   "101"}, {"MA",   "101"},
        {"AD",   "110"}, {"DA",   "110"},
        {"AMD",  "111"}, {"ADM",  "111"}, {"DAM",  "111"}, {"DMA",  "111"}, {"MAD",  "111"}, {"MDA",  "111"}
    };

    private static final String[][] compCode = {
        {"0",   "0101010"},
        {"1",   "0111111"},
        {"-1",  "0111010"},
        {"D",   "0001100"},
        {"A",   "0110000"},
        {"!D",  "0001101"},
        {"!A",  "0110001"},
        {"-D",  "0001111"},
        {"-A",  "0110011"},
        {"D+1", "0011111"}, {"1+D", "0011111"},
        {"A+1", "0110111"}, {"1+A", "0110111"},
        {"D-1", "0001110"},
        {"A-1", "0110010"},
        {"D+A", "0000010"}, {"A+D", "0000010"},
        {"D-A", "0010011"},
        {"A-D", "0000111"},
        {"D&A", "0000000"}, {"A&D", "0000000"},
        {"D|A", "0010101"}, {"A|D", "0010101"},
        {"M",   "1110000"},
        {"!M",  "1110001"},
        {"-M",  "1110011"},
        {"M+1", "1110111"}, {"1+M", "1110111"},
        {"M-1", "1110010"},
        {"D+M", "1000010"}, {"M+D", "1000010"},
        {"D-M", "1010011"},
        {"M-D", "1000111"},
        {"D&M", "1000000"}, {"M&D", "1000000"},
        {"D|M", "1010101"}, {"M|D", "1010101"}
    };

    private static final String[][] jumpCode = {
        {"",     "000"},
        {"JGT",  "001"},
        {"JEQ",  "010"},
        {"JGE",  "011"},
        {"JLT",  "100"},
        {"JNE",  "101"},
        {"JLE",  "110"},
        {"JMP",  "111"}
    };

    static{
        for(String[] dest : destCode)
            destMap.put(dest[0], dest[1]);

        for(String[] comp : compCode)
            compMap.put(comp[0], comp[1]);

        for(String[] jump : jumpCode)
            jumpMap.put(jump[0], jump[1]);
    }

    static String dest(String mnemonic){
        if(destMap.containsKey(mnemonic))
            return destMap.get(mnemonic);
        else
            throw new IllegalStateException("Unsupported dest code \"" + mnemonic + "\"");
    }

    static String comp(String mnemonic){
        if(compMap.containsKey(mnemonic))
            return compMap.get(mnemonic);
        else
            throw new IllegalStateException("Unsupported comp code \"" + mnemonic + "\"");
    }

    static String jump(String mnemonic){
        if(jumpMap.containsKey(mnemonic))
            return jumpMap.get(mnemonic);
        else
            throw new IllegalStateException("Unsupported jump code \"" + mnemonic + "\"");
    }
}
