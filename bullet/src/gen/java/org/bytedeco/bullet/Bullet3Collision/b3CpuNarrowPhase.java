// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3CpuNarrowPhase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3CpuNarrowPhase(Pointer p) { super(p); }

	public b3CpuNarrowPhase(@Const @ByRef b3Config config) { super((Pointer)null); allocate(config); }
	private native void allocate(@Const @ByRef b3Config config);

	
	

	
	

	

	//do they need to be merged?

	public native int registerConvexHullShape(b3ConvexUtility utilPtr);
	public native int registerConvexHullShape(@Const FloatPointer vertices, int strideInBytes, int numVertices, @Const FloatPointer scaling);
	public native int registerConvexHullShape(@Const FloatBuffer vertices, int strideInBytes, int numVertices, @Const FloatBuffer scaling);
	public native int registerConvexHullShape(@Const float[] vertices, int strideInBytes, int numVertices, @Const float[] scaling);

	//int registerRigidBody(int collidableIndex, float mass, const float* position, const float* orientation, const float* aabbMin, const float* aabbMax,bool writeToGpu);
	

	
	
	
	

	
	

	//virtual void computeContacts(cl_mem broadphasePairs, int numBroadphasePairs, cl_mem aabbsWorldSpace, int numObjects);
	public native void computeContacts(@ByRef b3Int4Array pairs, @ByRef b3AabbArray aabbsWorldSpace, @ByRef b3RigidBodyDataArray bodies);

	
	//struct b3RigidBodyData* getBodiesCpu();

	

	

	
	

	/*const struct b3Contact4* getContactsCPU() const;

	
	int	getNumContactsGpu() const;
	*/

	public native @Const @ByRef b3Contact4DataArray getContacts();

	

	public native int allocateCollidable();

	public native int getStatic0Index();
	public native @ByRef b3Collidable getCollidableCpu(int collidableIndex);

	

	public native @Const @ByRef b3Aabb getLocalSpaceAabb(int collidableIndex);
}
