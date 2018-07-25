package Device;

/**
 * Define Command structure
 * @author USER
 *
 */
public class DeviceCommand {
	private final char cmdID = 'C';
	private final int cmdLength = 4;
	private final char valueID = 'X';
	private final int valueLenght = 4;
	private final int cmdMinimumLenght = (1 + cmdLength) + (1 + valueLenght);
	private final String extractHexadecimal = "^[a-fA-F0-9]+$";
	
	private eDeviceCommands cmd = eDeviceCommands.NONE;
	private int value = 0;	
	
	/**
	 * Constructs a device command
	 * @param cmd : eDeviceCommands
	 * @param value : int
	 */
	public DeviceCommand(eDeviceCommands cmd, int value){
		this.cmd = cmd;
		this.value = value;
	}
		
	/**
	 * Constructs a device command from a String
	 * @param command : String
	 */
	public DeviceCommand(String command)
	{
		if(command.length() >= cmdMinimumLenght)
		{
			command = command.toUpperCase();
			int idxCmdID = command.indexOf(cmdID);
			int idxValueID = command.indexOf(valueID);
			if(idxCmdID > -1)
			{
				if(idxValueID > -1)
				{
					if((idxCmdID + cmdLength) < idxValueID)
					{
						String auxCmd = command.substring(idxCmdID+1, idxCmdID + cmdLength + 1);
						if(auxCmd.matches(extractHexadecimal) && parseStringToCommandID(auxCmd))
						{
							if((idxValueID + valueLenght) < command.length())
							{
								String auxValue = command.substring(idxValueID+1, idxValueID + valueLenght + 1);
								if(auxValue.matches(extractHexadecimal) && parseStringToCommandValue(auxValue))
								{
									// Great!!!
								}
								else
								{
									throw new Error("DeviceCommand value wrong value.");
								}
							}
							else
							{
								throw new Error("DeviceCommand value wrong format.");
							}
						}
						else
						{
							throw new Error("DeviceCommand ID wrong value.");
						}
					}
					else
					{
						throw new Error("DeviceCommand ID wrong format.");
					}
				}
				else
				{
					throw new Error("DeviceCommand value ID is not present.");
				}
			}
			else
			{
				throw new Error("DeviceCommand cmd ID is not present.");
			}
		}
		else
		{
			throw new Error("DeviceCommand string is below the minimum.");
		}
	}

	/**
	 * Gets device command ID
	 * @return eDeviceCommands
	 */
	public eDeviceCommands getId()
	{
		return cmd;
	}
	
	/**
	 * Gets device command value
	 * @return int
	 */
	public int getValue()
	{
		return value;
	}
	
	/**
	 * Gets command ID from a string
	 * @param strCommand
	 * @return
	 */
	private boolean parseStringToCommandID(String strCommand)
	{
		boolean retval = false; 
		
		try {
			int id = Integer.parseInt(strCommand, 16);
			
			for (eDeviceCommands var : eDeviceCommands.values()) {
				if(var.getValue() == id)
				{
					this.cmd = var;
					retval = true;
					break;
				}
			}	
		} catch (Exception e) {
			throw new Error("DeviceCommand get value error.");
		}
		
		return retval;
	}

	/**
	 * Gets command value from a string
	 * @param strCommand
	 * @return
	 */
	private boolean parseStringToCommandValue(String strCommand)
	{
		boolean retval = false; 
		
		try {
			this.value = Integer.parseInt(strCommand, 16);
			retval = true;
		} catch (Exception e) {
			throw new Error("DeviceCommand get value error.");
		}
		
		return retval;
	}

	/**
	 * Gets a command device in a string format
	 */
	public String toString(){
		String cmdFormat = "%0" + String.valueOf(cmdLength) + "X";
		String valueFormat = "%0" + String.valueOf(valueLenght) + "X";
		String retval = cmdID + String.format(cmdFormat, cmd.getValue()) + valueID + String.format(valueFormat, value);
		return retval;
	}
	
	/**
	 * Determines if a DeviceCommand is equal to another one
	 * @param deviceCommand
	 * @return
	 */
	public Boolean equals(DeviceCommand deviceCommand) {
		return (cmd == deviceCommand.cmd) && (value == deviceCommand.value);
	}
}
