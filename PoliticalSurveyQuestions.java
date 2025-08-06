public class PoliticalSurveyQuestions {
        public static final String[][][] QUESTIONS = {
                        // Question 1
                        {
                                        { "What should be the government's role in healthcare?" },
                                        {
                                                        "Implement a universal single-payer system",
                                                        "Allow free-market competition with minimal regulation",
                                                        "Maintain private insurance with some regulations",
                                                        "A mix of public and private options with state flexibility"
                                        }
                        },
                        // Question 2
                        {
                                        { "How should taxes be structured?" },
                                        {
                                                        "Higher taxes on the wealthy to fund social programs",
                                                        "Minimal taxes, with voluntary contributions for services",
                                                        "Lower taxes across the board to stimulate growth",
                                                        "Moderate taxes with balanced spending"
                                        }
                        },
                        // Question 3
                        {
                                        { "What is the best approach to regulating businesses?" },
                                        {
                                                        "Strong regulations to protect workers and consumers",
                                                        "Minimal regulations to encourage free enterprise",
                                                        "Moderate regulations favoring business growth",
                                                        "Case-by-case regulation based on industry needs"
                                        }
                        },
                        // Question 4
                        {
                                        { "What should the government do about abortion rights?" },
                                        {
                                                        "Protect abortion access nationwide",
                                                        "Government should not be involved—leave it to individuals",
                                                        "Restrict abortion with limited exceptions",
                                                        "Allow states to decide their own laws"
                                        }
                        },
                        // Question 5
                        {
                                        { "How should the U.S. handle gun control?" },
                                        {
                                                        "Stricter background checks and assault weapon bans",
                                                        "No restrictions—protect full Second Amendment rights",
                                                        "Enforce existing laws but oppose new restrictions",
                                                        "Some regulations but respect gun ownership rights"
                                        }
                        },
                        // Question 6
                        {
                                        { "What is your stance on LGBTQ+ rights?" },
                                        {
                                                        "Full legal protections and anti-discrimination laws",
                                                        "Government should not interfere in personal matters",
                                                        "Traditional values should be prioritized",
                                                        "Support rights but with some cultural exceptions"
                                        }
                        },
                        // Question 7
                        {
                                        { "What should U.S. foreign policy prioritize?" },
                                        {
                                                        "Diplomacy and international alliances",
                                                        "Non-intervention and reduced military spending",
                                                        "Strong military and assertive global leadership",
                                                        "Selective engagement based on national interest"
                                        }
                        },
                        // Question 8
                        {
                                        { "How should immigration be handled?" },
                                        {
                                                        "Pathway to citizenship for undocumented immigrants",
                                                        "Open borders with minimal restrictions",
                                                        "Strong border security and merit-based immigration",
                                                        "Balanced approach with controlled legal immigration"
                                        }
                        },
                        // Question 9
                        {
                                        { "What is the best approach to climate change?" },
                                        {
                                                        "Green New Deal-style government intervention",
                                                        "Let the free market and innovation solve it",
                                                        "Oppose excessive regulations hurting businesses",
                                                        "Moderate policies encouraging clean energy"
                                        }
                        },
                        // Question 10
                        {
                                        { "How much should the government surveil citizens for security?" },
                                        {
                                                        "Some surveillance with strict oversight",
                                                        "No surveillance—privacy is absolute",
                                                        "Strong surveillance to prevent threats",
                                                        "Limited surveillance with judicial checks"
                                        }
                        },
                        // Question 11
                        {
                                        { "What should be done about student loan debt?" },
                                        {
                                                        "Widespread forgiveness and free college",
                                                        "Government should not be involved in loans",
                                                        "Oppose forgiveness—personal responsibility",
                                                        "Partial relief with repayment reforms"
                                        }
                        },
                        // Question 12
                        {
                                        { "Should social media be regulated for misinformation?" },
                                        {
                                                        "Yes, to prevent harm",
                                                        "No—absolute free speech",
                                                        "Only if biased against conservatives",
                                                        "Some oversight but avoid censorship"
                                        }
                        },
                        // Question 13
                        {
                                        { "What is the best way to reduce crime?" },
                                        {
                                                        "Address root causes like poverty",
                                                        "Decriminalize many offenses",
                                                        "More police and tougher sentencing",
                                                        "A mix of policing and social programs"
                                        }
                        },
                        // Question 14
                        {
                                        { "Should the U.S. have a central bank (Federal Reserve)?" },
                                        {
                                                        "Yes, but reform it",
                                                        "No—end the Fed",
                                                        "Keep it with minimal changes",
                                                        "Adjust its role but keep it"
                                        }
                        },
                        // Question 15
                        {
                                        { "What is your view on unions?" },
                                        {
                                                        "Strongly support worker unions",
                                                        "Oppose—let individuals negotiate",
                                                        "Prefer right-to-work laws",
                                                        "Support some unions but not all"
                                        }
                        }
        };

        // Constants for party indices
        private static final int DEMOCRAT = 0;
        private static final int LIBERTARIAN = 1;
        private static final int REPUBLICAN = 2;
        private static final int INDEPENDENT = 3;

        // Answer key mapping (question index -> answer index -> party)
        public static final int[][] ANSWER_KEY = {
                        { DEMOCRAT, LIBERTARIAN, REPUBLICAN, INDEPENDENT }, // Q1
                        { DEMOCRAT, LIBERTARIAN, REPUBLICAN, INDEPENDENT }, // Q2
                        { DEMOCRAT, LIBERTARIAN, REPUBLICAN, INDEPENDENT }, // Q3
                        { DEMOCRAT, LIBERTARIAN, REPUBLICAN, INDEPENDENT }, // Q4
                        { DEMOCRAT, LIBERTARIAN, REPUBLICAN, INDEPENDENT }, // Q5
                        { DEMOCRAT, LIBERTARIAN, REPUBLICAN, INDEPENDENT }, // Q6
                        { DEMOCRAT, LIBERTARIAN, REPUBLICAN, INDEPENDENT }, // Q7
                        { DEMOCRAT, LIBERTARIAN, REPUBLICAN, INDEPENDENT }, // Q8
                        { DEMOCRAT, LIBERTARIAN, REPUBLICAN, INDEPENDENT }, // Q9
                        { DEMOCRAT, LIBERTARIAN, REPUBLICAN, INDEPENDENT }, // Q10
                        { DEMOCRAT, LIBERTARIAN, REPUBLICAN, INDEPENDENT }, // Q11
                        { DEMOCRAT, LIBERTARIAN, REPUBLICAN, INDEPENDENT }, // Q12
                        { DEMOCRAT, LIBERTARIAN, REPUBLICAN, INDEPENDENT }, // Q13
                        { DEMOCRAT, LIBERTARIAN, REPUBLICAN, INDEPENDENT }, // Q14
                        { DEMOCRAT, LIBERTARIAN, REPUBLICAN, INDEPENDENT } // Q15
        };

        public static String[][][] getQuestions() {
                return QUESTIONS;
        }

        /**
         * Gets a specific question by index
         * 
         * @param index Question number (0-based)
         * @return 2D array containing question and answers
         */
        public static String[][] getQuestion(int index) {
                if (index >= 0 && index < QUESTIONS.length) {
                        return QUESTIONS[index];
                }
                throw new IllegalArgumentException("Invalid question index: " + index);
        }

        public static int getQuestionCount() {
                return QUESTIONS.length;
        }

        public static int getAnswerParty(int questionIndex, int answerIndex) {
                if (questionIndex < 0 || questionIndex >= ANSWER_KEY.length) {
                        throw new IllegalArgumentException("Invalid question index");
                }
                if (answerIndex < 0 || answerIndex >= 4) {
                        throw new IllegalArgumentException("Answer must be between 0-3");
                }
                return ANSWER_KEY[questionIndex][answerIndex];
        }

        public static String getPartyName(int partyIndex) {
                if (partyIndex < 0 || partyIndex >= PARTY_NAMES.length) {
                        throw new IllegalArgumentException("Invalid party index");
                }
                return PARTY_NAMES[partyIndex];
        }

        public static void printQuestion(int questionIndex) {
                String[][] question = getQuestion(questionIndex);
                System.out.println("\nQuestion " + (questionIndex + 1) + ": " + question[0][0]);
                for (int i = 0; i < question[1].length; i++) {
                        System.out.println((char) ('A' + i) + ") " + question[1][i]);
                }
        }
}
