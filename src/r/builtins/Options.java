package r.builtins;

import r.data.*;
import r.nodes.*;
import r.nodes.truffle.*;

import com.oracle.truffle.api.frame.*;

// TODO: implement this builtin at least to support custom options
//       shooutout benchmarks set the "digits" option
public class Options {
    public static final CallFactory FACTORY = new CallFactory() {

        @Override
        public RNode create(ASTNode call, RSymbol[] names, RNode[] exprs) {
            return new BuiltIn(call, names, exprs) {

                @Override
                public final RAny doBuiltIn(Frame frame, RAny[] args) {
                    return RNull.getNull();
                }

            };
        }
    };
}