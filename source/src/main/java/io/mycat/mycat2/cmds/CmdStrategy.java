package io.mycat.mycat2.cmds;

import io.mycat.mycat2.MycatSession;

/**
 * 
 * @author yanjunli
 *
 */
public interface CmdStrategy {
	
	void matchMySqlCommand(MycatSession session);

}
