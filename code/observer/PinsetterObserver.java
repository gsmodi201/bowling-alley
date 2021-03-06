package observer;/* $Id$
 *
 * Revisions:
 *   $Log: observer.PinsetterObserver.java,v $
 *   Revision 1.3  2003/01/30 21:44:25  ???
 *   Fixed speling of received in may places.
 *
 *   Revision 1.2  2003/01/26 22:34:44  ???
 *   Total rewrite of lane and pinsetter for R2's observer model
 *   Added entity.Lane/entity.Pinsetter Observer
 *   Rewrite of scoring algorythm in lane
 *
 *   Revision 1.1  2003/01/19 21:04:24  ???
 *   created pinsetterevent and pinsetterobserver
 *
 *
 */


import events.PinsetterEvent;

public interface PinsetterObserver {

	/** recievePinsetterEvent()
	 * 
	 * defines the method for an object torecieve a pinsetter event
	 */
	public void receivePinsetterEvent(PinsetterEvent pe);
};

