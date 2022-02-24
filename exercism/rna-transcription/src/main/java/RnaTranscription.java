class RnaTranscription {
    String transcribe(String dnaStrand) {
        StringBuilder rnaStrand = new StringBuilder();
        for (int i = 0; i < dnaStrand.length(); i++){
            switch(dnaStrand.charAt(i)){
            case 'A':
                rnaStrand.append("U");
                break;
            case 'C':
                rnaStrand.append("G");
                break;
            case 'T':
                rnaStrand.append("A");
                break;
            case 'G':
                rnaStrand.append("C");
                break;
            default:
                return "Invalid input";
            }
        }
        return rnaStrand.toString();
    }
}
