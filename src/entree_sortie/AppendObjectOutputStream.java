package entree_sortie;
import java.io.*;

/**
 * @author Romain
 *
 */
public class AppendObjectOutputStream extends ObjectOutputStream {
	 
		/**
		 * @param out
		 * @throws IOException
		 */
		public AppendObjectOutputStream (OutputStream out) throws IOException {
			super(out);
		}
	 
		@Override
		protected void writeStreamHeader() throws IOException {
			reset();
		}
	}
