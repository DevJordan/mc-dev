package net.minecraft.server;

public class BlockRedstone extends BlockOreBlock {

    public BlockRedstone(int i) {
        super(i);
        this.a(CreativeModeTab.d);
    }

    public boolean isPowerSource() {
        return true;
    }

    public int b(IBlockAccess iblockaccess, int i, int j, int k, int l) {
        return 15;
    }
}
