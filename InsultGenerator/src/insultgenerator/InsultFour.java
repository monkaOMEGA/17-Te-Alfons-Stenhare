package insultgenerator;

public class InsultFour {

    private InsultFour() {
        String[] choice1 = {"artless", "bawdy", "beslubbering", "bootless",
            "churlish", "cockered", "clouted", "craven", "currish", "dankish",
            "dissembling", "droning", "errant", "fawning", "fobbing", "froward",
            "frothy", "gleeking", "goatish", "gorbellied", "impertinent", "infectious",
            "jarring", "loggerheaded", "lumpish", "mammering", "mangled", "mewling",
            "paunchy", "pribbling", "puking", "puny", "qualling", "rank", "reeky",
            "roguish", "ruttish", "saucy", "spleeny", "spongy", "surly", "tottering",
            "unmuzzled", "vain", "venomed", "villainous", "warped", "wayward",
            "weedy", "yeasty"};

        String[] choice2 = {"base-court", "bat-fowling", "beef-witted",
            "beetle-headed", "clapper-clawed", "clay-brained", "common-kissing",
            "crook-pated", "dismal-dreaming", "dizzy-eyed", "doghearted",
            "dread-bolted", "earth-vexing", "elf-skinned", "fat-kidneyed",
            "fen-sucked", "flap-mouthed", "fly-bitten", "folly-fallen",
            "fool-born", "full-gorged", "guts-griping", "half-faced", "hasty-witted",
            "hedge-born", "hell-hated", "idle-headed", "ill-breeding", "ill-nutured",
            "knotty-pated", "milk-livered", "motley-minded", "onion-eyed",
            "plume-plucked", "pottle-deep", "pox-marked", "reeling-ripe",
            "rough-hewn", "rude-growing", "rump-fed", "shard-borne", "sheep-biting",
            "spur-galled", "swag-bellied", "tardy-gaited", "tickle-brained",
            "toad-spotted", "unchin-snouted", "weather-bitten", "boil-brained"};

        String[] choice3 = {"apple-john", "baggage", "barnacle", "bladder",
            "boar-pig", "bugbear", "bum-bailey", "canker-blossom", "clack-dish",
            "clotpole", "coxcomb", "codpiece", "death-token", "dewberry",
            "flap-dragon", "flax-wench", "flirt-gill", "foot-licker", "fustilarian",
            "giglet", "gudgeon", "haggard", "harpy", "hedge-pig", "horn-beast",
            "hugger-mugger", "joithead", "lewdster", "lout", "maggot-pie",
            "malt-worm", "mammet", "measle", "minnow", "miscreant", "mold-warp",
            "mumble-news", "nut-hook", "piegon egg", "pignut", "puttock",
            "pumpion", "ratsbane", "scut", "skainsmate", "strumpet", "varlot",
            "vassal", "whey-face", "wagtail"};

        System.out.println("Thou "
                + choice1[(int) (Math.random() * choice1.length)] + " "
                + choice2[(int) (Math.random() * choice2.length)] + " "
                + choice3[(int) (Math.random() * choice3.length)] + "!");
    }

    public static void main(String[] args) {
        InsultFour insult = new InsultFour();
    }
}
