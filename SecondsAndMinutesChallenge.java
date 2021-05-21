public class SecondsAndMinutesChallenge {


    public static String getDurationString(int minutes,int seconds){
        if((minutes<0)||(seconds<0)||(seconds>60)){
            return "Invalid Value";
        }
        long hours=minutes/60;
        long remainingminutes=minutes%60;
        return hours+"h "+remainingminutes+"m "+seconds+"s";
    }

    public static String getDurationString(int )
}
