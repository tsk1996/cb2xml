/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AItemElementaryItem extends PElementaryItem
{
    private PItem _item_;

    public AItemElementaryItem()
    {
        // Constructor
    }

    public AItemElementaryItem(
        @SuppressWarnings("hiding") PItem _item_)
    {
        // Constructor
        setItem(_item_);

    }

    @Override
    public Object clone()
    {
        return new AItemElementaryItem(
            cloneNode(this._item_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAItemElementaryItem(this);
    }

    public PItem getItem()
    {
        return this._item_;
    }

    public void setItem(PItem node)
    {
        if(this._item_ != null)
        {
            this._item_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._item_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._item_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._item_ == child)
        {
            this._item_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._item_ == oldChild)
        {
            setItem((PItem) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}