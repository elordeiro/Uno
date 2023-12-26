# Uno Game Simulator
- This program simulates a game of Uno. It is written in Java, and it simulates a run with 4 players.  
- The number of players, and how many cards they start with can be modified.  
- The output is a log of the game, with the cards each player has, the cards that are played and the  
direction of the game at each turn.

## Sample Output

```
Starting game...

Top card:  GREEN-FIVE     Direction: vv
>>Player 0 hand [7]: [  BLUE-EIGHT   ,   BLUE-REVERSE ,   BLUE-FIVE    , YELLOW-TWO     ,    RED-EIGHT   ,  GREEN-TWO     ,    RED-FIVE    ]
  Player 1 hand [7]: [YELLOW-ZERO    ,   BLUE-REVERSE ,    RED-SIX     ,  GREEN-SKIP    ,   BLUE-EIGHT   , YELLOW-SKIP    ,  GREEN-FOUR    ]
  Player 2 hand [7]: [   RED-THREE   , YELLOW-TWO     ,    RED-DRAW_TWO,   BLUE-FOUR    , YELLOW-FOUR    , YELLOW-REVERSE ,  GREEN-SEVEN   ]
  Player 3 hand [7]: [  BLUE-DRAW_TWO, YELLOW-ONE     ,  GREEN-NINE    , YELLOW-THREE   ,    RED-TWO     , YELLOW-NINE    ,   BLUE-DRAW_TWO]

Player 0 played    RED-FIVE    

Top card:    RED-FIVE     Direction: vv
  Player 0 hand [6]: [  BLUE-REVERSE ,   BLUE-EIGHT   ,    RED-EIGHT   ,  GREEN-TWO     ,   BLUE-FIVE    , YELLOW-TWO     ]
>>Player 1 hand [7]: [YELLOW-ZERO    ,   BLUE-REVERSE ,    RED-SIX     ,  GREEN-SKIP    ,   BLUE-EIGHT   , YELLOW-SKIP    ,  GREEN-FOUR    ]
  Player 2 hand [7]: [   RED-THREE   , YELLOW-TWO     ,    RED-DRAW_TWO,   BLUE-FOUR    , YELLOW-FOUR    , YELLOW-REVERSE ,  GREEN-SEVEN   ]
  Player 3 hand [7]: [  BLUE-DRAW_TWO, YELLOW-ONE     ,  GREEN-NINE    , YELLOW-THREE   ,    RED-TWO     , YELLOW-NINE    ,   BLUE-DRAW_TWO]

Player 1 played    RED-SIX     

Top card:    RED-SIX      Direction: vv
  Player 0 hand [6]: [  BLUE-REVERSE ,   BLUE-EIGHT   ,    RED-EIGHT   ,  GREEN-TWO     ,   BLUE-FIVE    , YELLOW-TWO     ]
  Player 1 hand [6]: [ GREEN-FOUR    ,   BLUE-EIGHT   ,  GREEN-SKIP    ,   BLUE-REVERSE , YELLOW-ZERO    , YELLOW-SKIP    ]
>>Player 2 hand [7]: [   RED-THREE   , YELLOW-TWO     ,    RED-DRAW_TWO,   BLUE-FOUR    , YELLOW-FOUR    , YELLOW-REVERSE ,  GREEN-SEVEN   ]
  Player 3 hand [7]: [  BLUE-DRAW_TWO, YELLOW-ONE     ,  GREEN-NINE    , YELLOW-THREE   ,    RED-TWO     , YELLOW-NINE    ,   BLUE-DRAW_TWO]

Player 2 played    RED-THREE   

Top card:    RED-THREE    Direction: vv
  Player 0 hand [6]: [  BLUE-REVERSE ,   BLUE-EIGHT   ,    RED-EIGHT   ,  GREEN-TWO     ,   BLUE-FIVE    , YELLOW-TWO     ]
  Player 1 hand [6]: [ GREEN-FOUR    ,   BLUE-EIGHT   ,  GREEN-SKIP    ,   BLUE-REVERSE , YELLOW-ZERO    , YELLOW-SKIP    ]
  Player 2 hand [6]: [ GREEN-SEVEN   , YELLOW-FOUR    , YELLOW-REVERSE , YELLOW-TWO     ,   BLUE-FOUR    ,    RED-DRAW_TWO]
>>Player 3 hand [7]: [  BLUE-DRAW_TWO, YELLOW-ONE     ,  GREEN-NINE    , YELLOW-THREE   ,    RED-TWO     , YELLOW-NINE    ,   BLUE-DRAW_TWO]

Player 3 played YELLOW-THREE   

Top card: YELLOW-THREE    Direction: vv
>>Player 0 hand [6]: [  BLUE-REVERSE ,   BLUE-EIGHT   ,    RED-EIGHT   ,  GREEN-TWO     ,   BLUE-FIVE    , YELLOW-TWO     ]
  Player 1 hand [6]: [ GREEN-FOUR    ,   BLUE-EIGHT   ,  GREEN-SKIP    ,   BLUE-REVERSE , YELLOW-ZERO    , YELLOW-SKIP    ]
  Player 2 hand [6]: [ GREEN-SEVEN   , YELLOW-FOUR    , YELLOW-REVERSE , YELLOW-TWO     ,   BLUE-FOUR    ,    RED-DRAW_TWO]
  Player 3 hand [6]: [YELLOW-ONE     ,   BLUE-DRAW_TWO,   BLUE-DRAW_TWO,    RED-TWO     ,  GREEN-NINE    , YELLOW-NINE    ]

Player 0 played YELLOW-TWO     

Top card: YELLOW-TWO      Direction: vv
  Player 0 hand [5]: [  BLUE-EIGHT   ,   BLUE-FIVE    ,   BLUE-REVERSE ,    RED-EIGHT   ,  GREEN-TWO     ]
>>Player 1 hand [6]: [ GREEN-FOUR    ,   BLUE-EIGHT   ,  GREEN-SKIP    ,   BLUE-REVERSE , YELLOW-ZERO    , YELLOW-SKIP    ]
  Player 2 hand [6]: [ GREEN-SEVEN   , YELLOW-FOUR    , YELLOW-REVERSE , YELLOW-TWO     ,   BLUE-FOUR    ,    RED-DRAW_TWO]
  Player 3 hand [6]: [YELLOW-ONE     ,   BLUE-DRAW_TWO,   BLUE-DRAW_TWO,    RED-TWO     ,  GREEN-NINE    , YELLOW-NINE    ]

Player 1 played YELLOW-SKIP    

Player 2 was skipped...

Top card: YELLOW-SKIP     Direction: vv
  Player 0 hand [5]: [  BLUE-EIGHT   ,   BLUE-FIVE    ,   BLUE-REVERSE ,    RED-EIGHT   ,  GREEN-TWO     ]
  Player 1 hand [5]: [  BLUE-REVERSE ,  GREEN-FOUR    ,  GREEN-SKIP    ,   BLUE-EIGHT   , YELLOW-ZERO    ]
  Player 2 hand [6]: [ GREEN-SEVEN   , YELLOW-FOUR    , YELLOW-REVERSE , YELLOW-TWO     ,   BLUE-FOUR    ,    RED-DRAW_TWO]
>>Player 3 hand [6]: [YELLOW-ONE     ,   BLUE-DRAW_TWO,   BLUE-DRAW_TWO,    RED-TWO     ,  GREEN-NINE    , YELLOW-NINE    ]

Player 3 played YELLOW-ONE     

Top card: YELLOW-ONE      Direction: vv
>>Player 0 hand [5]: [  BLUE-EIGHT   ,   BLUE-FIVE    ,   BLUE-REVERSE ,    RED-EIGHT   ,  GREEN-TWO     ]
  Player 1 hand [5]: [  BLUE-REVERSE ,  GREEN-FOUR    ,  GREEN-SKIP    ,   BLUE-EIGHT   , YELLOW-ZERO    ]
  Player 2 hand [6]: [ GREEN-SEVEN   , YELLOW-FOUR    , YELLOW-REVERSE , YELLOW-TWO     ,   BLUE-FOUR    ,    RED-DRAW_TWO]
  Player 3 hand [5]: [  BLUE-DRAW_TWO,  GREEN-NINE    ,   BLUE-DRAW_TWO, YELLOW-NINE    ,    RED-TWO     ]

Player 0 drew a card
Player 0 didn't have a valid card to play

Top card: YELLOW-ONE      Direction: vv
  Player 0 hand [6]: [  BLUE-EIGHT   ,    RED-EIGHT   ,   BLUE-FIVE    ,   BLUE-REVERSE ,  GREEN-TWO     ,   BLUE-SKIP    ]
>>Player 1 hand [5]: [  BLUE-REVERSE ,  GREEN-FOUR    ,  GREEN-SKIP    ,   BLUE-EIGHT   , YELLOW-ZERO    ]
  Player 2 hand [6]: [ GREEN-SEVEN   , YELLOW-FOUR    , YELLOW-REVERSE , YELLOW-TWO     ,   BLUE-FOUR    ,    RED-DRAW_TWO]
  Player 3 hand [5]: [  BLUE-DRAW_TWO,  GREEN-NINE    ,   BLUE-DRAW_TWO, YELLOW-NINE    ,    RED-TWO     ]

Player 1 played YELLOW-ZERO    

Top card: YELLOW-ZERO     Direction: vv
  Player 0 hand [6]: [  BLUE-EIGHT   ,    RED-EIGHT   ,   BLUE-FIVE    ,   BLUE-REVERSE ,  GREEN-TWO     ,   BLUE-SKIP    ]
  Player 1 hand [4]: [  BLUE-REVERSE ,  GREEN-SKIP    ,  GREEN-FOUR    ,   BLUE-EIGHT   ]
>>Player 2 hand [6]: [ GREEN-SEVEN   , YELLOW-FOUR    , YELLOW-REVERSE , YELLOW-TWO     ,   BLUE-FOUR    ,    RED-DRAW_TWO]
  Player 3 hand [5]: [  BLUE-DRAW_TWO,  GREEN-NINE    ,   BLUE-DRAW_TWO, YELLOW-NINE    ,    RED-TWO     ]

Player 2 played YELLOW-REVERSE 

Game direction was reversed...

Top card: YELLOW-REVERSE  Direction: ^^
  Player 0 hand [6]: [  BLUE-EIGHT   ,    RED-EIGHT   ,   BLUE-FIVE    ,   BLUE-REVERSE ,  GREEN-TWO     ,   BLUE-SKIP    ]
>>Player 1 hand [4]: [  BLUE-REVERSE ,  GREEN-SKIP    ,  GREEN-FOUR    ,   BLUE-EIGHT   ]
  Player 2 hand [5]: [ GREEN-SEVEN   ,   BLUE-FOUR    , YELLOW-TWO     ,    RED-DRAW_TWO, YELLOW-FOUR    ]
  Player 3 hand [5]: [  BLUE-DRAW_TWO,  GREEN-NINE    ,   BLUE-DRAW_TWO, YELLOW-NINE    ,    RED-TWO     ]

Player 1 played   BLUE-REVERSE 

Game direction was reversed...

Top card:   BLUE-REVERSE  Direction: vv
  Player 0 hand [6]: [  BLUE-EIGHT   ,    RED-EIGHT   ,   BLUE-FIVE    ,   BLUE-REVERSE ,  GREEN-TWO     ,   BLUE-SKIP    ]
  Player 1 hand [3]: [ GREEN-SKIP    ,  GREEN-FOUR    ,   BLUE-EIGHT   ]
>>Player 2 hand [5]: [ GREEN-SEVEN   ,   BLUE-FOUR    , YELLOW-TWO     ,    RED-DRAW_TWO, YELLOW-FOUR    ]
  Player 3 hand [5]: [  BLUE-DRAW_TWO,  GREEN-NINE    ,   BLUE-DRAW_TWO, YELLOW-NINE    ,    RED-TWO     ]

Player 2 played   BLUE-FOUR    

Top card:   BLUE-FOUR     Direction: vv
  Player 0 hand [6]: [  BLUE-EIGHT   ,    RED-EIGHT   ,   BLUE-FIVE    ,   BLUE-REVERSE ,  GREEN-TWO     ,   BLUE-SKIP    ]
  Player 1 hand [3]: [ GREEN-SKIP    ,  GREEN-FOUR    ,   BLUE-EIGHT   ]
  Player 2 hand [4]: [ GREEN-SEVEN   , YELLOW-TWO     ,    RED-DRAW_TWO, YELLOW-FOUR    ]
>>Player 3 hand [5]: [  BLUE-DRAW_TWO,  GREEN-NINE    ,   BLUE-DRAW_TWO, YELLOW-NINE    ,    RED-TWO     ]

Player 3 played   BLUE-DRAW_TWO

Player 0 drew two cards and was skipped...

Top card:   BLUE-DRAW_TWO Direction: vv
  Player 0 hand [8]: [  BLUE-EIGHT   ,    RED-EIGHT   ,   BLUE-FIVE    ,   BLUE-REVERSE ,  GREEN-TWO     ,   BLUE-SKIP    , YELLOW-SEVEN   ,   BLUE-THREE   ]
>>Player 1 hand [3]: [ GREEN-SKIP    ,  GREEN-FOUR    ,   BLUE-EIGHT   ]
  Player 2 hand [4]: [ GREEN-SEVEN   , YELLOW-TWO     ,    RED-DRAW_TWO, YELLOW-FOUR    ]
  Player 3 hand [4]: [YELLOW-NINE    ,    RED-TWO     ,   BLUE-DRAW_TWO,  GREEN-NINE    ]

Player 1 played   BLUE-EIGHT   

Top card:   BLUE-EIGHT    Direction: vv
  Player 0 hand [8]: [  BLUE-EIGHT   ,    RED-EIGHT   ,   BLUE-FIVE    ,   BLUE-REVERSE ,  GREEN-TWO     ,   BLUE-SKIP    , YELLOW-SEVEN   ,   BLUE-THREE   ]
  Player 1 hand [2]: [ GREEN-SKIP    ,  GREEN-FOUR    ]
>>Player 2 hand [4]: [ GREEN-SEVEN   , YELLOW-TWO     ,    RED-DRAW_TWO, YELLOW-FOUR    ]
  Player 3 hand [4]: [YELLOW-NINE    ,    RED-TWO     ,   BLUE-DRAW_TWO,  GREEN-NINE    ]

Player 2 drew a card
Player 2 played   BLUE-SEVEN   

Top card:   BLUE-SEVEN    Direction: vv
  Player 0 hand [8]: [  BLUE-EIGHT   ,    RED-EIGHT   ,   BLUE-FIVE    ,   BLUE-REVERSE ,  GREEN-TWO     ,   BLUE-SKIP    , YELLOW-SEVEN   ,   BLUE-THREE   ]
  Player 1 hand [2]: [ GREEN-SKIP    ,  GREEN-FOUR    ]
  Player 2 hand [4]: [   RED-DRAW_TWO, YELLOW-FOUR    , YELLOW-TWO     ,  GREEN-SEVEN   ]
>>Player 3 hand [4]: [YELLOW-NINE    ,    RED-TWO     ,   BLUE-DRAW_TWO,  GREEN-NINE    ]

Player 3 played   BLUE-DRAW_TWO

Player 0 drew two cards and was skipped...

Top card:   BLUE-DRAW_TWO Direction: vv
  Player 0 hand [10]: [  BLUE-EIGHT   ,    RED-EIGHT   ,   BLUE-FIVE    ,   BLUE-REVERSE ,  GREEN-TWO     ,   BLUE-SKIP    , YELLOW-SEVEN   ,   BLUE-THREE   ,  GREEN-NINE    ,    RED-SIX     ]
>>Player 1 hand [2]: [ GREEN-SKIP    ,  GREEN-FOUR    ]
  Player 2 hand [4]: [   RED-DRAW_TWO, YELLOW-FOUR    , YELLOW-TWO     ,  GREEN-SEVEN   ]
  Player 3 hand [3]: [ GREEN-NINE    , YELLOW-NINE    ,    RED-TWO     ]

Player 1 drew a card
Player 1 didn't have a valid card to play

Top card:   BLUE-DRAW_TWO Direction: vv
  Player 0 hand [10]: [  BLUE-EIGHT   ,    RED-EIGHT   ,   BLUE-FIVE    ,   BLUE-REVERSE ,  GREEN-TWO     ,   BLUE-SKIP    , YELLOW-SEVEN   ,   BLUE-THREE   ,  GREEN-NINE    ,    RED-SIX     ]
  Player 1 hand [3]: [ GREEN-FOUR    , YELLOW-FIVE    ,  GREEN-SKIP    ]
>>Player 2 hand [4]: [   RED-DRAW_TWO, YELLOW-FOUR    , YELLOW-TWO     ,  GREEN-SEVEN   ]
  Player 3 hand [3]: [ GREEN-NINE    , YELLOW-NINE    ,    RED-TWO     ]

Player 2 played    RED-DRAW_TWO

Player 3 drew two cards and was skipped...

Top card:    RED-DRAW_TWO Direction: vv
>>Player 0 hand [10]: [  BLUE-EIGHT   ,    RED-EIGHT   ,   BLUE-FIVE    ,   BLUE-REVERSE ,  GREEN-TWO     ,   BLUE-SKIP    , YELLOW-SEVEN   ,   BLUE-THREE   ,  GREEN-NINE    ,    RED-SIX     ]
  Player 1 hand [3]: [ GREEN-FOUR    , YELLOW-FIVE    ,  GREEN-SKIP    ]
  Player 2 hand [3]: [YELLOW-FOUR    ,  GREEN-SEVEN   , YELLOW-TWO     ]
  Player 3 hand [5]: [ GREEN-NINE    , YELLOW-NINE    ,    RED-TWO     ,   BLUE-SKIP    , YELLOW-EIGHT   ]

Player 0 played    RED-EIGHT   

Top card:    RED-EIGHT    Direction: vv
  Player 0 hand [9]: [YELLOW-SEVEN   ,  GREEN-TWO     ,   BLUE-SKIP    ,  GREEN-NINE    ,   BLUE-REVERSE ,   BLUE-THREE   ,   BLUE-EIGHT   ,    RED-SIX     ,   BLUE-FIVE    ]
>>Player 1 hand [3]: [ GREEN-FOUR    , YELLOW-FIVE    ,  GREEN-SKIP    ]
  Player 2 hand [3]: [YELLOW-FOUR    ,  GREEN-SEVEN   , YELLOW-TWO     ]
  Player 3 hand [5]: [ GREEN-NINE    , YELLOW-NINE    ,    RED-TWO     ,   BLUE-SKIP    , YELLOW-EIGHT   ]

Player 1 drew a card
Player 1 played    RED-FOUR    

Top card:    RED-FOUR     Direction: vv
  Player 0 hand [9]: [YELLOW-SEVEN   ,  GREEN-TWO     ,   BLUE-SKIP    ,  GREEN-NINE    ,   BLUE-REVERSE ,   BLUE-THREE   ,   BLUE-EIGHT   ,    RED-SIX     ,   BLUE-FIVE    ]
  Player 1 hand [3]: [ GREEN-SKIP    , YELLOW-FIVE    ,  GREEN-FOUR    ]
>>Player 2 hand [3]: [YELLOW-FOUR    ,  GREEN-SEVEN   , YELLOW-TWO     ]
  Player 3 hand [5]: [ GREEN-NINE    , YELLOW-NINE    ,    RED-TWO     ,   BLUE-SKIP    , YELLOW-EIGHT   ]

Player 2 played YELLOW-FOUR    

Top card: YELLOW-FOUR     Direction: vv
  Player 0 hand [9]: [YELLOW-SEVEN   ,  GREEN-TWO     ,   BLUE-SKIP    ,  GREEN-NINE    ,   BLUE-REVERSE ,   BLUE-THREE   ,   BLUE-EIGHT   ,    RED-SIX     ,   BLUE-FIVE    ]
  Player 1 hand [3]: [ GREEN-SKIP    , YELLOW-FIVE    ,  GREEN-FOUR    ]
  Player 2 hand [2]: [YELLOW-TWO     ,  GREEN-SEVEN   ]
>>Player 3 hand [5]: [ GREEN-NINE    , YELLOW-NINE    ,    RED-TWO     ,   BLUE-SKIP    , YELLOW-EIGHT   ]

Player 3 played YELLOW-NINE    

Top card: YELLOW-NINE     Direction: vv
>>Player 0 hand [9]: [YELLOW-SEVEN   ,  GREEN-TWO     ,   BLUE-SKIP    ,  GREEN-NINE    ,   BLUE-REVERSE ,   BLUE-THREE   ,   BLUE-EIGHT   ,    RED-SIX     ,   BLUE-FIVE    ]
  Player 1 hand [3]: [ GREEN-SKIP    , YELLOW-FIVE    ,  GREEN-FOUR    ]
  Player 2 hand [2]: [YELLOW-TWO     ,  GREEN-SEVEN   ]
  Player 3 hand [4]: [ GREEN-NINE    ,   BLUE-SKIP    ,    RED-TWO     , YELLOW-EIGHT   ]

Player 0 played  GREEN-NINE    

Top card:  GREEN-NINE     Direction: vv
  Player 0 hand [8]: [  BLUE-REVERSE ,   BLUE-EIGHT   , YELLOW-SEVEN   ,   BLUE-FIVE    ,   BLUE-SKIP    ,    RED-SIX     ,  GREEN-TWO     ,   BLUE-THREE   ]
>>Player 1 hand [3]: [ GREEN-SKIP    , YELLOW-FIVE    ,  GREEN-FOUR    ]
  Player 2 hand [2]: [YELLOW-TWO     ,  GREEN-SEVEN   ]
  Player 3 hand [4]: [ GREEN-NINE    ,   BLUE-SKIP    ,    RED-TWO     , YELLOW-EIGHT   ]

Player 1 played  GREEN-FOUR    

Top card:  GREEN-FOUR     Direction: vv
  Player 0 hand [8]: [  BLUE-REVERSE ,   BLUE-EIGHT   , YELLOW-SEVEN   ,   BLUE-FIVE    ,   BLUE-SKIP    ,    RED-SIX     ,  GREEN-TWO     ,   BLUE-THREE   ]
  Player 1 hand [2]: [ GREEN-SKIP    , YELLOW-FIVE    ]
>>Player 2 hand [2]: [YELLOW-TWO     ,  GREEN-SEVEN   ]
  Player 3 hand [4]: [ GREEN-NINE    ,   BLUE-SKIP    ,    RED-TWO     , YELLOW-EIGHT   ]

Player 2 played  GREEN-SEVEN   

Top card:  GREEN-SEVEN    Direction: vv
  Player 0 hand [8]: [  BLUE-REVERSE ,   BLUE-EIGHT   , YELLOW-SEVEN   ,   BLUE-FIVE    ,   BLUE-SKIP    ,    RED-SIX     ,  GREEN-TWO     ,   BLUE-THREE   ]
  Player 1 hand [2]: [ GREEN-SKIP    , YELLOW-FIVE    ]
  Player 2 hand [1]: [YELLOW-TWO     ]
>>Player 3 hand [4]: [ GREEN-NINE    ,   BLUE-SKIP    ,    RED-TWO     , YELLOW-EIGHT   ]

Player 3 played  GREEN-NINE    

Top card:  GREEN-NINE     Direction: vv
>>Player 0 hand [8]: [  BLUE-REVERSE ,   BLUE-EIGHT   , YELLOW-SEVEN   ,   BLUE-FIVE    ,   BLUE-SKIP    ,    RED-SIX     ,  GREEN-TWO     ,   BLUE-THREE   ]
  Player 1 hand [2]: [ GREEN-SKIP    , YELLOW-FIVE    ]
  Player 2 hand [1]: [YELLOW-TWO     ]
  Player 3 hand [3]: [   RED-TWO     , YELLOW-EIGHT   ,   BLUE-SKIP    ]

Player 0 played  GREEN-TWO     

Top card:  GREEN-TWO      Direction: vv
  Player 0 hand [7]: [YELLOW-SEVEN   ,   BLUE-FIVE    ,   BLUE-REVERSE ,   BLUE-EIGHT   ,    RED-SIX     ,   BLUE-THREE   ,   BLUE-SKIP    ]
>>Player 1 hand [2]: [ GREEN-SKIP    , YELLOW-FIVE    ]
  Player 2 hand [1]: [YELLOW-TWO     ]
  Player 3 hand [3]: [   RED-TWO     , YELLOW-EIGHT   ,   BLUE-SKIP    ]

Player 1 played  GREEN-SKIP    

Player 2 was skipped...

Top card:  GREEN-SKIP     Direction: vv
  Player 0 hand [7]: [YELLOW-SEVEN   ,   BLUE-FIVE    ,   BLUE-REVERSE ,   BLUE-EIGHT   ,    RED-SIX     ,   BLUE-THREE   ,   BLUE-SKIP    ]
  Player 1 hand [1]: [YELLOW-FIVE    ]
  Player 2 hand [1]: [YELLOW-TWO     ]
>>Player 3 hand [3]: [   RED-TWO     , YELLOW-EIGHT   ,   BLUE-SKIP    ]

Player 3 played   BLUE-SKIP    

Player 0 was skipped...

Top card:   BLUE-SKIP     Direction: vv
  Player 0 hand [7]: [YELLOW-SEVEN   ,   BLUE-FIVE    ,   BLUE-REVERSE ,   BLUE-EIGHT   ,    RED-SIX     ,   BLUE-THREE   ,   BLUE-SKIP    ]
>>Player 1 hand [1]: [YELLOW-FIVE    ]
  Player 2 hand [1]: [YELLOW-TWO     ]
  Player 3 hand [2]: [   RED-TWO     , YELLOW-EIGHT   ]

Player 1 drew a card
Player 1 played   BLUE-SEVEN   

Top card:   BLUE-SEVEN    Direction: vv
  Player 0 hand [7]: [YELLOW-SEVEN   ,   BLUE-FIVE    ,   BLUE-REVERSE ,   BLUE-EIGHT   ,    RED-SIX     ,   BLUE-THREE   ,   BLUE-SKIP    ]
  Player 1 hand [1]: [YELLOW-FIVE    ]
>>Player 2 hand [1]: [YELLOW-TWO     ]
  Player 3 hand [2]: [   RED-TWO     , YELLOW-EIGHT   ]

Player 2 drew a card
Player 2 played  GREEN-SEVEN   

Top card:  GREEN-SEVEN    Direction: vv
  Player 0 hand [7]: [YELLOW-SEVEN   ,   BLUE-FIVE    ,   BLUE-REVERSE ,   BLUE-EIGHT   ,    RED-SIX     ,   BLUE-THREE   ,   BLUE-SKIP    ]
  Player 1 hand [1]: [YELLOW-FIVE    ]
  Player 2 hand [1]: [YELLOW-TWO     ]
>>Player 3 hand [2]: [   RED-TWO     , YELLOW-EIGHT   ]

Player 3 drew a card
Player 3 played  GREEN-EIGHT   

Top card:  GREEN-EIGHT    Direction: vv
>>Player 0 hand [7]: [YELLOW-SEVEN   ,   BLUE-FIVE    ,   BLUE-REVERSE ,   BLUE-EIGHT   ,    RED-SIX     ,   BLUE-THREE   ,   BLUE-SKIP    ]
  Player 1 hand [1]: [YELLOW-FIVE    ]
  Player 2 hand [1]: [YELLOW-TWO     ]
  Player 3 hand [2]: [YELLOW-EIGHT   ,    RED-TWO     ]

Player 0 played   BLUE-EIGHT   

Top card:   BLUE-EIGHT    Direction: vv
  Player 0 hand [6]: [  BLUE-FIVE    ,    RED-SIX     ,   BLUE-SKIP    , YELLOW-SEVEN   ,   BLUE-REVERSE ,   BLUE-THREE   ]
>>Player 1 hand [1]: [YELLOW-FIVE    ]
  Player 2 hand [1]: [YELLOW-TWO     ]
  Player 3 hand [2]: [YELLOW-EIGHT   ,    RED-TWO     ]

Player 1 drew a card
Player 1 didn't have a valid card to play

Top card:   BLUE-EIGHT    Direction: vv
  Player 0 hand [6]: [  BLUE-FIVE    ,    RED-SIX     ,   BLUE-SKIP    , YELLOW-SEVEN   ,   BLUE-REVERSE ,   BLUE-THREE   ]
  Player 1 hand [2]: [YELLOW-FIVE    ,  GREEN-TWO     ]
>>Player 2 hand [1]: [YELLOW-TWO     ]
  Player 3 hand [2]: [YELLOW-EIGHT   ,    RED-TWO     ]

Player 2 drew a card
Player 2 didn't have a valid card to play

Top card:   BLUE-EIGHT    Direction: vv
  Player 0 hand [6]: [  BLUE-FIVE    ,    RED-SIX     ,   BLUE-SKIP    , YELLOW-SEVEN   ,   BLUE-REVERSE ,   BLUE-THREE   ]
  Player 1 hand [2]: [YELLOW-FIVE    ,  GREEN-TWO     ]
  Player 2 hand [2]: [ GREEN-SKIP    , YELLOW-TWO     ]
>>Player 3 hand [2]: [YELLOW-EIGHT   ,    RED-TWO     ]

Player 3 played YELLOW-EIGHT   

Top card: YELLOW-EIGHT    Direction: vv
>>Player 0 hand [6]: [  BLUE-FIVE    ,    RED-SIX     ,   BLUE-SKIP    , YELLOW-SEVEN   ,   BLUE-REVERSE ,   BLUE-THREE   ]
  Player 1 hand [2]: [YELLOW-FIVE    ,  GREEN-TWO     ]
  Player 2 hand [2]: [ GREEN-SKIP    , YELLOW-TWO     ]
  Player 3 hand [1]: [   RED-TWO     ]

Player 0 played YELLOW-SEVEN   

Top card: YELLOW-SEVEN    Direction: vv
  Player 0 hand [5]: [  BLUE-SKIP    ,   BLUE-FIVE    ,   BLUE-THREE   ,    RED-SIX     ,   BLUE-REVERSE ]
>>Player 1 hand [2]: [YELLOW-FIVE    ,  GREEN-TWO     ]
  Player 2 hand [2]: [ GREEN-SKIP    , YELLOW-TWO     ]
  Player 3 hand [1]: [   RED-TWO     ]

Player 1 played YELLOW-FIVE    

Top card: YELLOW-FIVE     Direction: vv
  Player 0 hand [5]: [  BLUE-SKIP    ,   BLUE-FIVE    ,   BLUE-THREE   ,    RED-SIX     ,   BLUE-REVERSE ]
  Player 1 hand [1]: [ GREEN-TWO     ]
>>Player 2 hand [2]: [ GREEN-SKIP    , YELLOW-TWO     ]
  Player 3 hand [1]: [   RED-TWO     ]

Player 2 played YELLOW-TWO     

Top card: YELLOW-TWO      Direction: vv
  Player 0 hand [5]: [  BLUE-SKIP    ,   BLUE-FIVE    ,   BLUE-THREE   ,    RED-SIX     ,   BLUE-REVERSE ]
  Player 1 hand [1]: [ GREEN-TWO     ]
  Player 2 hand [1]: [ GREEN-SKIP    ]
>>Player 3 hand [1]: [   RED-TWO     ]

Player 3 played    RED-TWO     

Game over!
Winner: Player 3
```