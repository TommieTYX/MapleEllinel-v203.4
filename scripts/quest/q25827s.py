# 25825 - [Job Advancement] Agent of Justige (AB 2nd job adv)
from net.swordie.ms.loaders import ItemData

ESKALADE_NPC_ID = 3000132

sm.setSpeakerID(ESKALADE_NPC_ID)
if chr.getLevel() >= 100 and chr.getJob() == 6511:
    sm.sendNext("You've been working up quite a sweat, #h #.")
else:
    sm.dispose()

sm.setSpeakerID(ESKALADE_NPC_ID)
sm.setPlayerAsSpeaker()
sm.sendNext("I want to be the hero of the people! I gotta work my butt off! Angelic Savior!")
sm.sendNext("I like it when you talk like that. I have a little proposition for you...")
sm.sendNext("I hate it when you use big words like that. You sound so serious.")
sm.sendNext("I'm always serious.")
sm.sendNext("That's... kinda scary.")
sm.sendNext("...We need a new contract.")
sm.sendNext("Aww, another one?!")
sm.sendNext("Our first contract was guided by fate! This one has to come from the heart! It's all about consensual bonding.")
sm.sendNext("That sounds weird. Is it gonna make everything more pink again?")
response = sm.sendAskYesNo("Probably, but you can deal! Now focus on my exceedingly attractive voice, okay? Just really "
                "listen to the timbre.")
if response == 1:
    sm.sendSayOkay("I'm tougher than all the rest!")
else:
    sm.dispose()

sm.setJob(6512)
sm.addSP(5)
sm.addAP(5)
sm.giveAndEquip(1352604)
chr.setSpToCurrentJob(5)
sm.dispose()
