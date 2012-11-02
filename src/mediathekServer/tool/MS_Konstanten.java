/*
 * MediathekView
 * Copyright (C) 2008 W. Xaver
 * W.Xaver[at]googlemail.com
 * http://zdfmediathk.sourceforge.net/
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package mediathekServer.tool;

public class MS_Konstanten {

    public static final String VERSION = "1.0";
    public static final String PROGRAMMNAME = "MediathekServer";
    public static final String USER_AGENT_DEFAULT = PROGRAMMNAME + " " + VERSION;
    // Dateien/Verzeichnisse
    public static final String VERZEICHNISS_EINSTELLUNGEN = ".mediathekServer";
    public static final String XML_DATEI = "mediathekServer.xml";
    public static final String XML_LOG_FILE = "ms_log.xml";
    public static final String ADRESSE_PROGRAMM_VERSION = "http://zdfmediathk.sourceforge.net/version-server.xml";
    public static final String PROGRAMM_UPDATE_URL_RSS = "http://sourceforge.net/api/file/index/project-id/222825/mtime/desc/limit/100/rss";
    //  <title><![CDATA[/Entwicklerversion/MediathekView_3.0.0_2012.10.26.zip]]></title>
    public static final String PROGRAMM_UPDATE_TAG_CDATA_TITEL = "MediathekView";
    // <link>http://sourceforge.net/projects/zdfmediathk/files/Entwicklerversion/MediathekView_3.0.0_2012.10.26.zip/download</link>
    public static final String PROGRAMM_UPDATE_TAG_URL = "link";
    // 
    public static final String XML_START = "MediathekServer";
    public static final String STR_TRUE = "1";
    public static final String STR_FALSE = "0";
    //
    // Konstanten System
    public static final String SYSTEM_USER_AGENT = "system-user-agent";
    public static final int SYSTEM_USER_AGENT_NR = 0;
    public static final String SYSTEM_UPDATE_SUCHEN = "system-update-suchen";
    public static final int SYSTEM_UPDATE_SUCHEN_NR = 1;
    public static final String SYSTEM_IMPORT_URL = "system-import-url";
    public static final int SYSTEM_IMPORT_URL_NR = 2;
    // Array
    public static final String SYSTEM = "system";
    public static final int SYSTEM_MAX_ELEM = 3;
    public static final String[] SYSTEM_COLUMN_NAMES = {SYSTEM_USER_AGENT, SYSTEM_UPDATE_SUCHEN, SYSTEM_IMPORT_URL};
    //
    // Konstanten Suchen
    public static final String SUCHEN_ALLES = "alles";
    public static final String SUCHEN_UPDATE = "update";
    //
    public static final String SUCHEN_WAS = "suchen-was";
    public static final int SUCHEN_WAS_NR = 0;
    public static final String SUCHEN_WANN = "suchen-wann";
    public static final int SUCHEN_WANN_NR = 1;
    // Array
    public static final String SUCHEN = "suchen";
    public static final int SUCHEN_MAX_ELEM = 2;
    public static final String[] SUCHEN_COLUMN_NAMES = {SUCHEN_WAS, SUCHEN_WANN};
    //
    //
    // Konstanten Upload
    public static final String UPLOAD_ART = "upload-art";
    public static final int UPLOAD_ART_NR = 0;
    public static final String UPLOAD_SERVER = "upload-server";
    public static final int UPLOAD_SERVER_NR = 1;
    public static final String UPLOAD_USER = "upload-user";
    public static final int UPLOAD_USER_NR = 2;
    public static final String UPLOAD_PWD = "upload-pwd";
    public static final int UPLOAD_PWD_NR = 3;
    public static final String UPLOAD_DEST_DIR = "upload-des-dir";
    public static final int UPLOAD_DEST_DIR_NR = 4;
    public static final String UPLOAD_PORT = "upload-port";
    public static final int UPLOAD_PORT_NR = 5;
    public static final String UPLOAD_EXEC = "upload-exec";
    public static final int UPLOAD_EXEC_NR = 6;
    // Array
    public static final String UPLOAD = "upload";
    public static final int UPLOAD_MAX_ELEM = 7;
    public static final String[] UPLOAD_COLUMN_NAMES = {UPLOAD_ART, UPLOAD_SERVER, UPLOAD_USER, UPLOAD_PWD, UPLOAD_DEST_DIR, UPLOAD_PORT, UPLOAD_EXEC};
}
