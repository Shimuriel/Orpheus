/*
	This file is part of the OdinMS Maple Story Server
    Copyright (C) 2008 Patrick Huy <patrick.huy@frz.cc>
		       Matthias Butz <matze@odinms.de>
		       Jan Christian Meyer <vimes@odinms.de>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation version 3 as published by
    the Free Software Foundation. You may not use, modify or distribute
    this program under any other version of the GNU Affero General Public
    License.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net;

public enum SendOpcode {
	LOGIN_STATUS(0x00), SEND_LINK(0x01), SERVERSTATUS(0x03), GENDER_DONE(0x04), TOS(0x05), PIN_OPERATION(0x06), PIN_ASSIGNED(0x07), ALL_CHARLIST(0x08), AFTER_LOGIN_ERROR(0x09), SERVERLIST(0x0A), CHARLIST(0x0B), SERVER_IP(0x0C), CHAR_NAME_RESPONSE(0x0D), ADD_NEW_CHAR_ENTRY(0x0E), DELETE_CHAR_RESPONSE(0x0F), CHANGE_CHANNEL(0x10), PING(0x11), KOREAN_INTERNET_CAFE_SHIT(0x12), // Useless
																																																																																														// ignore
																																																																																														// it.
	CHANNEL_SELECTED(0x14), RELOG_RESPONSE(0x16), SELECT_WORLD(0x1A), SEND_RECOMMENDED(0x1B), WRONG_PIC(0x1C), MODIFY_INVENTORY_ITEM(0x1D), UPDATE_INVENTORY_SLOTS(0x1E), UPDATE_STATS(0x1F), GIVE_BUFF(0x20), CANCEL_BUFF(0x21), TEMPORARY_STATS(0x22), TEMPORARY_SKILLS(0x23), UPDATE_SKILLS(0x24), FAME_RESPONSE(0x26), SHOW_STATUS_INFO(0x27), GAMEPATCHES_DC(0x28), NOTE_ACTION(0x29), TROCK_LOCATIONS(0x2A), LIE_DETECTOR(0x2B), REPORTREPLY(0x2D), ENABLE_REPORT(0x2F), UPDATE_MOUNT(0x30), SHOW_QUEST_COMPLETION(0x31), SEND_TITLE_BOX(0x32), USE_SKILL_BOOK(0x33), FINISH_SORT(0x34), FINISH_SORT2(0x35), REPORT_RESPONSE(0x37), MESO_LIMIT(0x39), GENDER(0x3A), BBS_OPERATION(0x3B), CHAR_INFO(0x3D), PARTY_OPERATION(0x3E), BUDDYLIST(0x3F), GUILD_OPERATION(0x41), ALLIANCE_OPERATION(0x42), SPAWN_PORTAL(0x43), SERVERMESSAGE(0x44), SOMETHING_WITH_INVENTORY(0x45), // 45
																																																																																																																																																																																																																					// 00
																																																																																																																																																																																																																					// 00
																																																																																																																																																																																																																					// =
																																																																																																																																																																																																																					// Inventory
																																																																																																																																																																																																																					// is
																																																																																																																																																																																																																					// full
																																																																																																																																																																																																																					// betches
	OWL_OF_MINERVA(0x46), // WOOT
	RING_ACTION(0x48), RING_ACTION2(0x49), WEDDING_ACTION(0x4A), PET_MESSAGE(0x4C), // 4C
																					// 00
																					// 01
																					// 00
																					// 00
																					// 00
	YELLOW_TIP(0x4D), CATCH_MESSAGE(0x4F), PLAYER_NPC(0x51), MONSTERBOOK_ADD(0x53), MONSTER_BOOK_CHANGE_COVER(0x55), MINIMAP_SHIT(0x56), // Resets
																																			// minimap
																																			// or
																																			// something
																																			// xD
	ENERGY(0x5A), SHOW_PEDIGREE(0x5E), OPEN_FAMILY(0x5F), FAMILY_MESSAGE(0x60), FAMILY_INVITE(0x61), FAMILY_MESSAGE2(0x62), FAMILY_SENIOR_MESSAGE(0x63), LOAD_FAMILY(0x64), FAMILY_GAIN_REP(0x65), FAMILY_LOGIN(0x66), // ?
																																																						// is
																																																						// logged
																																																						// in.
																																																						// LOLWUT
	FAMILY_BUFF(0x67), FAMILY_USE_REQUEST(0x68), LEVELUP_MSG(0x69), MARRIAGE_MSG(0x6A), JOB_MSG(0x6B), BLANK_MESSAGE(0x6D), // It's
																															// not
																															// blank,
																															// It's
																															// a
																															// popup
																															// nibs
	AVATAR_MEGA(0x6F), NAME_CHANGE_MESSAGE(0x71), CHARACTER_TRANSFER_MESSAGE(0x72), UNKNOWN_ERROR_MSG(0x73), GM_POLICE(0x74), SILVER_BOX(0x75), UNKNOWN_MESSAGE3(0x76), NAME_CHANGE_MESSAGE2(0x78), EARN_TITLE_MSG(0x7A), MAPLE_ADMIN(0x7B), SKILL_MACRO(0x7C), WARP_TO_MAP(0x7D), OPEN_MTS(0x7E), OPEN_CASHSHOP(0x7F), RESET_SCREEN(0x82), BLOCK_MESSAGE(0x83), BLOCK_MESSAGE2(0x84), FORCED_MAP_EQUIP(0x85), MULTICHAT(0x86), WHISPER(0x87), SPOUSE_CHAT(0x88), WEIRD_MSG(0x89), // You
																																																																																																																					// can't
																																																																																																																					// use
																																																																																																																					// it
																																																																																																																					// in
																																																																																																																					// this
																																																																																																																					// map
	BOSS_ENV(0x8A), BLOCK_PORTAL_SHOP(0x8B), MAP_EFFECT(0x8E), HPQ_MOON(0x8F), // Thanks
																				// for
																				// the
																				// info
																				// RMZero.
	GM_PACKET(0x90), OX_QUIZ(0x91), GMEVENT_INSTRUCTIONS(0x92), CLOCK(0x93), BOAT_EFFECT(0x95), POPUP(0x98), STOP_CLOCK(0x9A), ARIANT_SCOREBOARD(0x9B), PYRAMID_GAUGE(0x9D), PYRAMID_SCORE(0x9E), SPAWN_PLAYER(0xA0), REMOVE_PLAYER_FROM_MAP(0xA1), CHATTEXT(0xA2), CHATTEXT1(0xA3), // WEIRD,
																																																																						// EXACTLY
																																																																						// THE
																																																																						// SAME
																																																																						// SHIT?
	CHALKBOARD(0xA4), UPDATE_CHAR_BOX(0xA5), SHOW_SCROLL_EFFECT(0xA7), SPAWN_PET(0xA8), MOVE_PET(0xAA), PET_CHAT(0xAB), PET_NAMECHANGE(0xAC), PET_SHOW(0xAD), PET_COMMAND(0xAE), SPAWN_SPECIAL_MAPOBJECT(0xAF), REMOVE_SPECIAL_MAPOBJECT(0xB0), MOVE_SUMMON(0xB1), SUMMON_ATTACK(0xB2), DAMAGE_SUMMON(0xB3), SUMMON_SKILL(0xB4), MOVE_PLAYER(0xB9), CLOSE_RANGE_ATTACK(0xBA), RANGED_ATTACK(0xBB), MAGIC_ATTACK(0xBC), SKILL_EFFECT(0xBE), CANCEL_SKILL_EFFECT(0xBF), DAMAGE_PLAYER(0xC0), FACIAL_EXPRESSION(0xC1), SHOW_ITEM_EFFECT(0xC2), SHOW_CHAIR(0xC4), UPDATE_CHAR_LOOK(0xC5), SHOW_FOREIGN_EFFECT(0xC6), GIVE_FOREIGN_BUFF(0xC7), CANCEL_FOREIGN_BUFF(0xC8), UPDATE_PARTYMEMBER_HP(0xC9), CANCEL_CHAIR(0xCD), SHOW_ITEM_GAIN_INCHAT(0xCE), DOJO_WARP_UP(0xCF), LUCKSACK_PASS(0xD0), LUCKSACK_FAIL(0xD1), MESO_BAG_MESSAGE(0xD2), UPDATE_QUEST_INFO(0xD3), PLAYER_HINT(0xD6), KOREAN_EVENT(0xDB), OPEN_UI(0xDC), LOCK_UI(0xDD), DISABLE_UI(0xDE), SPAWN_GUIDE(0xDF), TALK_GUIDE(0xE0), SHOW_COMBO(0xE1), COOLDOWN(0xEA), SPAWN_MONSTER(0xEC), KILL_MONSTER(0xED), SPAWN_MONSTER_CONTROL(0xEE), MOVE_MONSTER(0xEF), MOVE_MONSTER_RESPONSE(0xF0), APPLY_MONSTER_STATUS(0xF2), CANCEL_MONSTER_STATUS(0xF3), RESET_MONSTER_ANIMATION(0xF4), // LOL?
																																																																																																																																																																																																																																																																																																												// o.o
	// Something with mob, but can't figure out00
	DAMAGE_MONSTER(0xF6), ARIANT_THING(0xF9), SHOW_MONSTER_HP(0xFA), SHOW_DRAGGED(0xFB), // CATCH
	CATCH_MONSTER(0xFC), SHOW_MAGNET(0xFD), SPAWN_NPC(0x101), REMOVE_NPC(0x102), SPAWN_NPC_REQUEST_CONTROLLER(0x103), NPC_ACTION(0x104), SET_NPC_SCRIPTABLE(0x107), SPAWN_HIRED_MERCHANT(0x109), DESTROY_HIRED_MERCHANT(0x10A), UPDATE_HIRED_MERCHANT(0x10B), DROP_ITEM_FROM_MAPOBJECT(0x10C), REMOVE_ITEM_FROM_MAP(0x10D), KITE_MESSAGE(0x10E), KITE(0x10F), SPAWN_MIST(0x111), REMOVE_MIST(0x112), SPAWN_DOOR(0x113), REMOVE_DOOR(0x114), REACTOR_HIT(0x115), REACTOR_SPAWN(0x117), REACTOR_DESTROY(0x118), ROLL_SNOWBALL(0x119), HIT_SNOWBALL(0x11A), SNOWBALL_MESSAGE(0x11B), LEFT_KNOCK_BACK(0x11C), HIT_COCONUT(0x11D), COCONUT_SCORE(0x11E), MONSTER_CARNIVAL_START(0x121), MONSTER_CARNIVAL_OBTAINED_CP(0x122), MONSTER_CARNIVAL_PARTY_CP(0x123), MONSTER_CARNIVAL_SUMMON(0x124), MONSTER_CARNIVAL_MESSAGE(0x125), MONSTER_CARNIVAL_DIED(0x126), MONSTER_CARNIVAL_LEAVE(0x127), SHEEP_RANCH_INFO(0x12B), SHEEP_RANCH_CLOTHES(0x12C), ARIANT_SCORE(0x12D), HORNTAIL_CAVE(0x12E), ZAKUM_SHRINE(0x12F), NPC_TALK(0x130), OPEN_NPC_SHOP(0x131), CONFIRM_SHOP_TRANSACTION(0x132), STORAGE(0x135), FREDRICK_MESSAGE(0x136), FREDRICK(0x137), MESSENGER(0x139), PLAYER_INTERACTION(0x13A), DUEY(0x13C), SHOW_CASH(0x144), CASHSHOP_OPERATION(0x145), KEYMAP(0x14F), AUTO_HP_POT(0x150), AUTO_MP_POT(0x151), SEND_TV(0x155), REMOVE_TV(0x156), ENABLE_TV(0x157), MTS_OPERATION2(0x15B), MTS_OPERATION(0x15C), VICIOUS_HAMMER(0x162);
	private int code = -2;

	private SendOpcode(int code) {
		this.code = code;
	}

	public int getValue() {
		return code;
	}
}
